# Architecture

## Overview

Projeto Java de exemplos educacionais organizado por pacotes e com automação mínima de qualidade sem dependências externas.

## Folder design

- `src/main/java/io/github/enoquesousa/praticandojava`: código-fonte principal
- `.../examples`: programas de console focados em sintaxe e operadores
- `.../algorithms`: exercícios de algoritmos
- `.../shared`: utilitários e lógica compartilhada
- `tests/unit/java`: suíte de testes unitários

## Decisions

1. **Sem framework de build externo**
   - Contexto: ambiente local sem Maven/Gradle instalado.
   - Decisão: scripts com `javac`/`java` para build/lint/test.
   - Trade-off: menos recursos avançados, maior portabilidade imediata.

2. **Pacote base único**
   - Contexto: arquivos originalmente no root/default package.
   - Decisão: pacote `io.github.enoquesousa.praticandojava` para padronização.
   - Trade-off: execução exige nome totalmente qualificado da classe.

3. **Test runner interno**
   - Contexto: ausência de gerenciador de dependências.
   - Decisão: suíte de teste com runner simples sem libs externas.
   - Trade-off: sem recursos avançados de JUnit, mas com validação funcional consistente.
