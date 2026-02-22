# Setup

## Requisitos

- Java JDK 21+
- PowerShell 7+ (Windows) ou Bash (Linux/macOS)

## Comandos principais

```bash
# Linux/macOS
bash scripts/tasks.sh build
bash scripts/tasks.sh lint
bash scripts/tasks.sh test
bash scripts/tasks.sh validate
```

```powershell
# Windows
./scripts/tasks.ps1 -Task build
./scripts/tasks.ps1 -Task lint
./scripts/tasks.ps1 -Task test
./scripts/tasks.ps1 -Task validate
```

## Executar exemplo específico

```bash
bash scripts/tasks.sh run io.github.enoquesousa.praticandojava.Main
```

```powershell
./scripts/tasks.ps1 -Task run -Class io.github.enoquesousa.praticandojava.Main
```
