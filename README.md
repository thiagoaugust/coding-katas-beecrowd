# Coding Katas

Repositorio para pratica de exercicios de programacao, com foco em logica, algoritmos, estruturas de dados e desenvolvimento orientado por testes.

O projeto atual esta configurado como um projeto Java Maven e usa JUnit 5 para testes unitarios.

## Configuracao Atual

| Item | Valor |
| --- | --- |
| Linguagem | Java |
| Build tool | Maven |
| Versao Java | 21 |
| Testes | JUnit 5 |
| Plugin de testes | Maven Surefire |
| Grupo Maven | `br.com.codingkatas` |
| Artefato Maven | `coding-katas` |

## Estrutura do Projeto

```text
.
├── .gitignore
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   ├── java/
    │   │   └── br/
    │   │       └── com/
    │   │           └── codingkatas/
    │   │               └── nivel1/
    │   │                   └── Bee1003.java
    │   └── resources/
    └── test/
        ├── java/
        │   └── br/
        │       └── com/
        │           └── codingkatas/
        │               └── nivel1/
        │                   └── Bee1003Test.java
        └── resources/
```

## Convencao de Organizacao

- `src/main/java`: codigo-fonte dos exercicios.
- `src/test/java`: testes unitarios dos exercicios.
- `src/main/resources`: recursos usados pelo codigo principal, quando necessario.
- `src/test/resources`: recursos usados por testes, quando necessario.
- `br.com.codingkatas`: pacote base do projeto.
- `nivel1`: pacote para exercicios de nivel 1.
- `BeeXXXX.java`: classe de solucao de um exercicio do Beecrowd.
- `BeeXXXXTest.java`: teste unitario correspondente a classe de solucao.

## Exercicio Atual

| Plataforma | Nivel | Classe | Teste |
| --- | --- | --- | --- |
| Beecrowd | Nivel 1 | `Bee1003` | `Bee1003Test` |

O exercicio `Bee1003` le dois valores inteiros pela entrada padrao, calcula a soma e imprime o resultado no formato esperado pelo Beecrowd:

```text
SOMA = valor
```

## Comandos Maven

Compilar o projeto:

```powershell
mvn compile
```

Executar todos os testes:

```powershell
mvn test
```

Executar apenas o teste do exercicio `Bee1003`:

```powershell
mvn -Dtest=Bee1003Test test
```

## Fluxo TDD Sugerido

1. Criar a classe do exercicio em `src/main/java/br/com/codingkatas/nivelX`.
2. Criar o teste correspondente em `src/test/java/br/com/codingkatas/nivelX`.
3. Simular a entrada padrao com `System.in`.
4. Capturar a saida padrao com `System.out`.
5. Validar exatamente o texto esperado pelo enunciado, incluindo quebra de linha.
6. Executar o teste e confirmar o estado vermelho.
7. Implementar a solucao ate o teste ficar verde.

## Objetivo

Manter um historico de pratica deliberada em programacao, usando exercicios pequenos para treinar leitura de enunciado, modelagem da solucao, precisao de entrada e saida, e testes automatizados.
