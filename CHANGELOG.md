# Changelog

All notable changes to this project will be documented in this file.

The format is based on Keep a Changelog,
and this project follows Semantic Versioning.

## [1.0.1] - 2026-02-21

### Changed
- Repositório marcado como arquivado para estudo, sem garantia de resposta, revisão ou correção.
- Dependabot configurado para não abrir novos pull requests.
- Templates de issue e PR atualizados com aviso visível de arquivamento.

## [1.0.0] - 2026-02-21

### Added
- Estrutura padrão de código em `src/main/java` e testes em `tests/unit/java`.
- Scripts de automação local em `scripts/tasks.ps1` e `scripts/tasks.sh`.
- Suíte de testes unitários com `TestRunner`.
- Governança GitHub: CI, Dependabot, templates de issue/PR, CODEOWNERS e FUNDING.
- Documentação de projeto: CONTRIBUTING, CODE_OF_CONDUCT, SECURITY e docs técnicos.
- Arquivo `BASELINE.md` e `FINAL.md` para governança interna.

### Changed
- Reorganização dos exemplos Java em pacotes (`io.github.enoquesousa.praticandojava`).
- Refatoração para remover duplicação de regra de maioridade via `AgeEligibilityFormatter`.
- README reescrito para padrão profissional com instruções operacionais.

### Removed
- Artefatos `.class` versionados no diretório raiz.
- Arquivos `.java` soltos no root após migração para `src/`.

### Fixed
- Higiene de repositório para evitar mistura de código-fonte e build output.

### Security
- Baseline de segurança criado (`SECURITY.md`).
- `.gitignore` expandido para evitar commit de arquivos sensíveis e artefatos.
