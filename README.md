# Coding Katas

Este repositório reúne exercícios de programação resolvidos como prática contínua de lógica, algoritmos e estruturas de dados.

No estado atual, o projeto contém soluções da plataforma Beecrowd implementadas em Java. A organização do código Java segue a estrutura padrão de diretórios de um projeto Maven, sem incluir arquivo `pom.xml`.

## Progresso

| Plataforma | Linguagem | Categoria | Problemas resolvidos |
| --- | --- | --- | --- |
| Beecrowd | Java | Iniciante | 35 |

## Estrutura do Projeto

```text
.
├── .gitignore
├── README.md
└── beecrowd/
    └── java/
        └── src/
            ├── main/
            │   ├── java/
            │   │   └── iniciante/
            │   │       ├── Main.java
            │   │       ├── uri1973/
            │   │       │   └── Main.java
            │   │       ├── uri2031/
            │   │       │   └── Main.java
            │   │       └── ...
            │   └── resources/
            └── test/
                ├── java/
                └── resources/
```

## Convenção de Organização

- `beecrowd/`: diretório da plataforma de desafios.
- `beecrowd/java/`: soluções da plataforma Beecrowd escritas em Java.
- `src/main/java/`: código-fonte principal, seguindo o padrão Maven.
- `src/main/resources/`: recursos da aplicação, quando necessários.
- `src/test/java/`: testes automatizados, quando forem adicionados.
- `src/test/resources/`: recursos usados por testes, quando necessários.
- `iniciante/`: categoria dos problemas resolvidos no Beecrowd.
- `uriXXXX/Main.java`: solução de um problema específico, identificada pelo código do desafio.

## Objetivo

O objetivo deste repositório é manter um histórico de prática deliberada em programação, com foco em:

- resolver problemas de forma recorrente;
- melhorar raciocínio lógico;
- praticar algoritmos e estruturas de dados;
- registrar soluções para consulta futura;
- evoluir a organização do código conforme o projeto crescer.

## Observações

As pastas `src/main/resources`, `src/test/java` e `src/test/resources` existem para manter o layout Maven padrão e podem permanecer vazias até que recursos ou testes sejam adicionados.
