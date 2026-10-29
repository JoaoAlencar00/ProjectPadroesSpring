# Padrões de projeto em Java

Demonstração de padrões de projeto aplicada à criação e ao gerenciamento de pedidos no console. O objetivo é praticar organização de responsabilidades, interfaces e composição em Java.

## O que o projeto demonstra

- **Strategy:** a interface `DiscountStrategy` permite alternar entre pedidos sem desconto e pedidos com 10% de desconto.
- **Singleton:** `PedidoManager` centraliza a lista de pedidos em uma instância.
- **Fábrica de objetos:** o método estático `PedidoFactory.criarPedido` escolhe a estratégia de desconto a partir do tipo informado.

A implementação da fábrica é estática e centralizada; não há hierarquia de criadores do padrão Factory Method.

## Exemplo incluído

A classe `Main` cria dois pedidos, adiciona ambos ao gerenciador e imprime a lista:

| Produto | Valor original | Estratégia | Valor calculado |
| --- | ---: | --- | ---: |
| Notebook | 5000,00 | 10% de desconto | 4500,00 |
| Mouse | 200,00 | Sem desconto | 200,00 |

## Estrutura

```text
src/main/java/com/example/patterns/
├── Main.java
├── discount/     # Contrato e estratégias de desconto
├── factory/      # Criação dos pedidos
├── model/        # Modelo Pedido
└── service/      # Gerenciador de pedidos
```

## Como executar

Requer um JDK com os comandos `javac` e `java` disponíveis. Na raiz do repositório:

```sh
git clone https://github.com/JoaoAlencar00/ProjectPadroesSpring.git
cd ProjectPadroesSpring
mkdir build
javac -encoding UTF-8 -d build -sourcepath src/main/java src/main/java/com/example/patterns/Main.java
java -cp build com.example.patterns.Main
```

## Escopo atual

Apesar do nome do repositório, a versão publicada usa **Java puro**, sem Spring, servidor HTTP ou API REST. Os pedidos ficam em memória; não há banco de dados nem configuração de Maven ou Gradle.

O Singleton é uma implementação didática sem controle de concorrência. Valores monetários usam `double`, e não há validação dos dados de entrada ou testes automatizados no repositório.
