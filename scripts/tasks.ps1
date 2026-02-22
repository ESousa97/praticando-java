param(
  [Parameter(Mandatory = $true)]
  [ValidateSet('clean', 'build', 'lint', 'test', 'run', 'validate')]
  [string]$Task,

  [string]$Class
)

$ErrorActionPreference = 'Stop'

$root = Split-Path -Parent $PSScriptRoot
$srcMain = Join-Path $root 'src/main/java'
$srcTest = Join-Path $root 'tests/unit/java'
$outMain = Join-Path $root 'out/main'
$outTest = Join-Path $root 'out/test'

function Get-JavaFiles([string]$path) {
  if (-not (Test-Path $path)) {
    return @()
  }
  return @(Get-ChildItem -Path $path -Filter '*.java' -Recurse | ForEach-Object { $_.FullName })
}

function New-OutputFolders {
  New-Item -ItemType Directory -Path $outMain -Force | Out-Null
  New-Item -ItemType Directory -Path $outTest -Force | Out-Null
}

function Invoke-MainBuild {
  $mainFiles = Get-JavaFiles $srcMain
  if ($mainFiles.Count -eq 0) {
    throw 'Nenhum arquivo Java encontrado em src/main/java.'
  }
  New-OutputFolders
  & javac -d $outMain @mainFiles
}

switch ($Task) {
  'clean' {
    Remove-Item -Recurse -Force (Join-Path $root 'out') -ErrorAction SilentlyContinue
  }
  'build' {
    Invoke-MainBuild
    Write-Host 'Build concluído com sucesso.'
  }
  'lint' {
    $mainFiles = Get-JavaFiles $srcMain
    if ($mainFiles.Count -eq 0) {
      throw 'Nenhum arquivo Java encontrado para lint.'
    }
    New-OutputFolders
    & javac -Xlint:all -Werror -d $outMain @mainFiles
    Write-Host 'Lint (javac -Xlint:all -Werror) concluído com sucesso.'
  }
  'test' {
    Invoke-MainBuild
    $testFiles = Get-JavaFiles $srcTest
    if ($testFiles.Count -eq 0) {
      throw 'Nenhum arquivo Java encontrado em tests/unit/java.'
    }
    & javac -cp $outMain -d $outTest @testFiles
    & java -cp "$outMain;$outTest" io.github.enoquesousa.praticandojava.TestRunner
  }
  'run' {
    if (-not $Class) {
      throw 'Informe a classe totalmente qualificada em -Class.'
    }
    Invoke-MainBuild
    & java -cp $outMain $Class
  }
  'validate' {
    & $PSCommandPath -Task clean
    & $PSCommandPath -Task lint
    & $PSCommandPath -Task test
    & $PSCommandPath -Task build
    Write-Host 'Validação completa finalizada.'
  }
}
