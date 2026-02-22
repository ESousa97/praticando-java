# Praticando Java

> Exemplos práticos de fundamentos Java com estrutura profissional de engenharia.

![CI](https://github.com/enoquesousa/praticando-java/actions/workflows/ci.yml/badge.svg)
![License](https://img.shields.io/github/license/enoquesousa/praticando-java)
![Java](https://img.shields.io/badge/java-%3E%3D21-blue)
![Last Commit](https://img.shields.io/github/last-commit/enoquesousa/praticando-java)
![Open Issues](https://img.shields.io/github/issues/enoquesousa/praticando-java)

---

Projeto educacional para prática de fundamentos de Java com foco em operadores, estruturas de controle e resolução de problemas de algoritmo.
O repositório foi organizado com padrão de produção para facilitar manutenção, revisão e evolução incremental.

## Demonstração

Exemplo de execução de classe principal:

```bash
bash scripts/tasks.sh run io.github.enoquesousa.praticandojava.Main
```

Exemplo de saída:

```text
Hello, World!
```

## Stack Tecnológico

- Java 21 LTS: linguagem e runtime
- javac: compilação e linting via `-Xlint:all -Werror`
- GitHub Actions: pipeline de CI
- Dependabot: atualização automática de workflows

## Pré-requisitos

- Java JDK 21+
- Bash (Linux/macOS) ou PowerShell 7+ (Windows)

## Instalação e Uso

```bash
git clone https://github.com/enoquesousa/praticando-java.git
cd praticando-java
cp .env.example .env
bash scripts/tasks.sh validate
```

No Windows PowerShell:

```powershell
git clone https://github.com/enoquesousa/praticando-java.git
cd praticando-java
Copy-Item .env.example .env
./scripts/tasks.ps1 -Task validate
```

Executar classe específica:

```bash
bash scripts/tasks.sh run io.github.enoquesousa.praticandojava.examples.ScreenMatch
```

## Scripts Disponíveis

| Script | Descrição |
|---|---|
| `build` | Compila o código em `out/main` |
| `lint` | Valida código com `javac -Xlint:all -Werror` |
| `test` | Executa suíte unitária em `tests/unit/java` |
| `run` | Compila e executa classe informada |
| `clean` | Remove artefatos de `out/` |
| `validate` | Executa `clean + lint + test + build` |

## Arquitetura

```text
.
├── src/main/java/io/github/enoquesousa/praticandojava
│   ├── Main.java
│   ├── algorithms/
│   ├── examples/
│   └── shared/
├── tests/unit/java/io/github/enoquesousa/praticandojava
├── scripts/
├── .github/
└── docs/
```

Detalhes em `docs/architecture.md`.

## API Reference

Não se aplica: projeto de aplicações de console sem API HTTP.

## Roadmap

- [x] Reorganização estrutural por pacotes
- [x] Pipeline de qualidade local (`lint`, `test`, `build`)
- [x] CI no GitHub Actions
- [x] Templates de issue e PR
- [ ] Expandir cobertura de testes para todos os exemplos
- [ ] Adicionar novos módulos didáticos (loops, collections, exceptions)

## Contribuindo

Veja `CONTRIBUTING.md` para setup, padrão de commits e fluxo de pull request.

## Licença

Este projeto está sob licença MIT. Consulte `LICENSE`.

## Autor

- Enoque Sousa
- Portfólio: https://enoquesousa.vercel.app
- GitHub: https://github.com/enoquesousa