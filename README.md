# Padrão Template Method

## Objetivo
Processo padronizado de avaliação de candidatos CLT, PJ e estagiários.

## Funcionamento
Funcionario define o algoritmo final verificarAdmissao(); cada subclasse altera apenas o critério getMediaCorte() (CLT 7, PJ 6, estágio 5).

## Tecnologias
- Java 11 ou superior
- Maven
- JUnit 5

## Estrutura
```text
padraoTemplateMethod/
├── pom.xml
├── README.md
├── docs/
│   └── diagrama.png
└── src/
    ├── main/java/padraoTemplateMethod/ (classes + Main.java)
    └── test/java/padraoTemplateMethod/ (testes JUnit)
```

## Como executar no terminal
No diretório do projeto, execute:
```bash
mvn clean test
mvn compile exec:java
```

Também é possível abrir diretamente o `pom.xml` no IntelliJ IDEA ou Eclipse e executar a classe `padraoTemplateMethod.Main`.

## Exemplo
Execute `Main.java` para ver o padrão em funcionamento.
A pasta `docs/` contém um diagrama ilustrativo das classes e/ou do fluxo.
