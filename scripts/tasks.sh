#!/usr/bin/env bash
set -euo pipefail

TASK="${1:-}"
CLASS="${2:-}"

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
SRC_MAIN="$ROOT_DIR/src/main/java"
SRC_TEST="$ROOT_DIR/tests/unit/java"
OUT_MAIN="$ROOT_DIR/out/main"
OUT_TEST="$ROOT_DIR/out/test"

main_files() {
  find "$SRC_MAIN" -type f -name '*.java'
}

test_files() {
  find "$SRC_TEST" -type f -name '*.java'
}

build_main() {
  mapfile -t files < <(main_files)
  if [[ ${#files[@]} -eq 0 ]]; then
    echo "Nenhum arquivo Java encontrado em src/main/java." >&2
    exit 1
  fi
  mkdir -p "$OUT_MAIN" "$OUT_TEST"
  javac -d "$OUT_MAIN" "${files[@]}"
}

case "$TASK" in
  clean)
    rm -rf "$ROOT_DIR/out"
    ;;
  build)
    build_main
    echo "Build concluído com sucesso."
    ;;
  lint)
    mapfile -t files < <(main_files)
    if [[ ${#files[@]} -eq 0 ]]; then
      echo "Nenhum arquivo Java encontrado para lint." >&2
      exit 1
    fi
    mkdir -p "$OUT_MAIN" "$OUT_TEST"
    javac -Xlint:all -Werror -d "$OUT_MAIN" "${files[@]}"
    echo "Lint (javac -Xlint:all -Werror) concluído com sucesso."
    ;;
  test)
    build_main
    mapfile -t files < <(test_files)
    if [[ ${#files[@]} -eq 0 ]]; then
      echo "Nenhum arquivo Java encontrado em tests/unit/java." >&2
      exit 1
    fi
    javac -cp "$OUT_MAIN" -d "$OUT_TEST" "${files[@]}"
    java -cp "$OUT_MAIN:$OUT_TEST" io.github.enoquesousa.praticandojava.TestRunner
    ;;
  run)
    if [[ -z "$CLASS" ]]; then
      echo "Informe a classe totalmente qualificada como segundo argumento." >&2
      exit 1
    fi
    build_main
    java -cp "$OUT_MAIN" "$CLASS"
    ;;
  validate)
    "$0" clean
    "$0" lint
    "$0" test
    "$0" build
    echo "Validação completa finalizada."
    ;;
  *)
    echo "Uso: $0 {clean|build|lint|test|run|validate} [classe]" >&2
    exit 1
    ;;
esac
