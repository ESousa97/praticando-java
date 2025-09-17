# 📚 Praticando Java

Este repositório contém códigos de prática para aprendizado da linguagem Java, cobrindo conceitos fundamentais desde variáveis até estruturas de controle e algoritmos.

## 🎯 Objetivo

Este projeto tem como objetivo consolidar o aprendizado dos conceitos básicos da programação Java através de exemplos práticos e exercícios.

## 📁 Estrutura do Projeto

### 🔤 Conceitos Básicos

#### `Main.java`
- **Conceito**: Primeiro programa em Java
- **Conteúdo**: Implementação clássica do "Hello, World!"
- **Aprendizado**: Estrutura básica de uma classe Java e método main

#### `Variaveis.java`
- **Conceito**: Operações aritméticas básicas
- **Conteúdo**: Demonstra as 4 operações fundamentais (+, -, *, /, %)
- **Aprendizado**: Manipulação de variáveis inteiras e operadores aritméticos

#### `TiposPrimitivos.java`
- **Conceito**: Tipos de dados primitivos em Java
- **Conteúdo**: Exemplos de todos os 8 tipos primitivos:
  - `boolean` - valores lógicos (true/false)
  - `byte` - inteiro de 8 bits (-128 a 127)
  - `char` - caractere Unicode
  - `short` - inteiro de 16 bits (-32,768 a 32,767)
  - `int` - inteiro de 32 bits
  - `long` - inteiro de 64 bits
  - `float` - decimal de precisão simples
  - `double` - decimal de precisão dupla
- **Aprendizado**: Faixas de valores e quando usar cada tipo

### 🔍 Operadores

#### `OperadoresRelacionais.java`
- **Conceito**: Operadores de comparação
- **Conteúdo**: Demonstra todos os operadores relacionais:
  - `==` (igualdade)
  - `!=` (diferença)
  - `>` (maior que)
  - `<` (menor que)
  - `>=` (maior ou igual)
  - `<=` (menor ou igual)
- **Aprendizado**: Como comparar valores e obter resultados boolean

#### `PraticandoOpRe.java`
- **Conceito**: Prática adicional com operadores relacionais
- **Conteúdo**: Armazena resultados de comparações em variáveis boolean
- **Aprendizado**: Uso prático de operadores relacionais em contexto real

#### `OperadoresIncremento.java`
- **Conceito**: Operadores de incremento e decremento
- **Conteúdo**: Diferença entre pré-incremento (`++var`) e pós-incremento (`var++`)
- **Aprendizado**: Como e quando o valor é modificado em cada caso

#### Operadores Lógicos

##### `OperadoresLogicosEE.java` (AND)
- **Conceito**: Operador lógico AND (`&&`)
- **Conteúdo**: Condição que só é verdadeira quando ambas as expressões são verdadeiras
- **Aprendizado**: Lógica de conjunção

##### `OperadoresLogicosOR.java` (OR)
- **Conceito**: Operador lógico OR (`||`)
- **Conteúdo**: Condição verdadeira quando pelo menos uma expressão é verdadeira
- **Aprendizado**: Lógica de disjunção

##### `OperadoresLogicosNot.java` (NOT)
- **Conceito**: Operador lógico NOT (`!`)
- **Conteúdo**: Inversão de valores boolean
- **Aprendizado**: Negação lógica

### 🌊 Estruturas de Controle

#### `PraticandoIfElse.java`
- **Conceito**: Estrutura condicional if-else
- **Conteúdo**: Verifica maioridade usando diferentes idades
- **Aprendizado**: Tomada de decisões baseada em condições

#### `PraticandoSwitchCase.java`
- **Conceito**: Estrutura switch-case
- **Conteúdo**: Mesma lógica do if-else mas usando switch
- **Aprendizado**: Alternativa ao if-else para múltiplas condições

### 🎬 Projeto Prático

#### `ScreenMatch.java`
- **Conceito**: Aplicação dos conceitos aprendidos
- **Conteúdo**: Sistema simples de informações sobre filmes
- **Recursos utilizados**:
  - Declaração de variáveis
  - Diferentes tipos de dados (int, boolean, double, String)
  - Concatenação de strings
  - Saída formatada no console
- **Aprendizado**: Integração de múltiplos conceitos em um projeto

### 🧩 Algoritmos

#### `StairClimber.java`
- **Conceito**: Problema clássico de programação dinâmica
- **Conteúdo**: Duas implementações para calcular quantas maneiras existem de subir escadas:
  - **Iterativa**: Usando loop for (mais eficiente)
  - **Memoização**: Usando recursão com cache (educacional)
- **Problema**: Dado n degraus, quantas formas há de subir se você pode dar 1 ou 2 passos por vez?
- **Aprendizado**: Otimização de algoritmos e pensamento recursivo

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior instalado
- IDE ou editor de texto (recomendado: VS Code, IntelliJ, Eclipse)

### Executando os programas

1. **Compilar um arquivo:**
```bash
javac NomeDoArquivo.java
```

2. **Executar o programa:**
```bash
java NomeDoArquivo
```

### Exemplo prático:
```bash
# Compilar
javac ScreenMatch.java

# Executar
java ScreenMatch
```

## 📖 Conceitos Aprendidos

### ✅ Fundamentos
- [x] Estrutura básica de uma classe Java
- [x] Método main e sua importância
- [x] Tipos primitivos e suas características
- [x] Declaração e inicialização de variáveis

### ✅ Operadores
- [x] Operadores aritméticos (+, -, *, /, %)
- [x] Operadores relacionais (==, !=, >, <, >=, <=)
- [x] Operadores lógicos (&&, ||, !)
- [x] Operadores de incremento/decremento (++, --)

### ✅ Estruturas de Controle
- [x] Estruturas condicionais (if-else)
- [x] Estrutura de seleção múltipla (switch-case)
- [x] Uso de break em switch

### ✅ Conceitos Avançados
- [x] Concatenação de strings
- [x] Algoritmos recursivos
- [x] Programação dinâmica (memoização)
- [x] Otimização de algoritmos

## 🎓 Próximos Passos

Para continuar o aprendizado, considere estudar:
- Loops (for, while, do-while)
- Arrays e Collections
- Métodos e funções
- Orientação a Objetos (classes, objetos, herança)
- Tratamento de exceções
- Entrada de dados do usuário (Scanner)

## 👤 Autor

Este repositório foi criado como parte do meu processo de aprendizado em Java.

---

*"A prática leva à perfeição. Continue codificando! 💻"*