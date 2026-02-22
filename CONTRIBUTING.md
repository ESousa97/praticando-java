# Contributing

> Arquivado: este repositório não está mais ativo e permanece público apenas para fins de estudo.
> Não há garantia de resposta, revisão, aceite de PR ou correção de issues.

## Development setup

1. Clone o repositório.
2. Instale JDK 21 (ou compatível com o código atual).
3. Execute os comandos:

```bash
# Linux/macOS
bash scripts/tasks.sh validate

# Windows PowerShell
./scripts/tasks.ps1 -Task validate
```

## Code style and conventions

- Estrutura de código em `src/main/java` e testes em `tests/unit/java`.
- Indentação e newline seguem `.editorconfig`.
- Formatação e linting são verificados por `javac -Xlint:all -Werror`.
- Nomeação Java padrão: classes em PascalCase, métodos/variáveis em camelCase.

## Branches, commits and pull requests

- Branch naming sugerido: `feat/<descricao-curta>`, `fix/<descricao-curta>`, `docs/<descricao-curta>`.
- Commits devem seguir Conventional Commits:

```text
<type>(<scope>): <description>
```

Tipos permitidos:
- `feat` nova funcionalidade
- `fix` correção de bug
- `refactor` refatoração sem mudança de comportamento
- `docs` documentação
- `style` formatação sem alteração lógica
- `test` adição/correção de testes
- `chore` manutenção/configuração
- `ci` mudanças de CI/CD
- `perf` melhoria de performance
- `security` correção de segurança

- Pull requests devem preencher o template em `.github/PULL_REQUEST_TEMPLATE.md`.

## Running tests

```bash
# Linux/macOS
bash scripts/tasks.sh test

# Windows PowerShell
./scripts/tasks.ps1 -Task test
```

## Contribution focus areas

- Novos exemplos Java mantendo consistência de pacotes.
- Expansão da suíte de testes unitários.
- Melhoria incremental da documentação técnica.

## Author

- Portfólio: https://enoquesousa.vercel.app
- GitHub: https://github.com/enoquesousa
