# Deployment

Este projeto é uma coleção de aplicações de console Java e não possui deployment web/server.

## Pipeline recomendado

- `lint` com `javac -Xlint:all -Werror`
- `test` com runner interno
- `build` para geração dos `.class` em `out/`

A automação oficial está em `.github/workflows/ci.yml`.
