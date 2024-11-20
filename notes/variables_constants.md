## Variáveis ​​e Constantes

Em Java, variáveis e constantes são os meios para armazenar e manipular dados na memória durante a execução de um programa. Entender como elas funcionam é fundamental para o desenvolvimento na linguagem.

### Variáveis

Uma variável é um espaço na memória que armazena um valor que pode ser modificado durante a execução do programa.

**Declaração de Variáveis**

A declaração de uma variável em Java segue a seguinte sintaxe: ```tipo nomeDaVariavel = valorInicial;```

Exemplo:

```java
    int idade = 25; // Declaração de uma variável do tipo inteiro
```

**Tipos de Variáveis**

Java é uma linguagem fortemente tipada, ou seja, cada variável precisa ter um tipo definido. Existem dois tipos principais:

* Tipos Primitivos:
    * byte: 8 bits, valores de -128 a 127.
    * short: 16 bits, valores de -32.768 a 32.767.
    * int: 32 bits, valores de -2³¹ a 2³¹-1.
    * long: 64 bits, valores de -2⁶³ a 2⁶³-1.
    * float: 32 bits, números decimais (precisão simples).
    * double: 64 bits, números decimais (precisão dupla).
    * char: 16 bits, representa um único caractere.
    * boolean: 1 bit, valores true ou false.

```java
    int numero = 10;       // Inteiro
    double preco = 19.99;  // Decimal
    char letra = 'A';      // Caractere
    boolean ativo = true;  // Booleano
```

* Tipos por Referência: Estes armazenam referências a objetos (instâncias de classes).
    * Exemplo: String, ArrayList, e outras classes definidas pelo programador.

    ```java
        String nome = "João";
    ```

**Regras para Nomes de Variáveis**

* Devem começar com uma letra, $ ou _.
* Não podem usar palavras reservadas (ex.: class, if, while).
* Devem ser descritivas, preferencialmente no estilo camelCase.

### Constantes

Uma constante é semelhante a uma variável, mas seu valor não pode ser alterado depois de inicializado. No Java, constantes são declaradas usando a palavra-chave final. ```final tipo NOME_DA_CONSTANTE = valor;```

Exemplo:

```java
    final double PI = 3.14159; // Constante para o valor de PI
```

**Convenções:**

* O nome das constantes geralmente é escrito em letras maiúsculas.
* Use o estilo snake_case para separar palavras.

### Diferenças entre Variáveis e Constantes

| Aspecto | Variáveis | Constantes |
| ------- | --------- | ---------- |
| Modificabilidade | Podem ter seu valor alterado | Não podem ser alteradas após inicialização. |
| Declaração | Sem a palavra-chave final. | Com a palavra-chave final. |
| Convenção de Nomenclatura | camelCase. | UPPER_SNAKE_CASE. |

### Escopo de Variáveis

O escopo determina onde a variável está acessível. Em Java, há quatro tipos principais de escopo:

* **Local:** Declarada dentro de um método ou bloco e só acessível ali.

```java
    void metodo() {
        int x = 10; // Variável local
    }
```

* **De Classe (Estática):** Declarada com a palavra-chave static e compartilhada por todas as instâncias da classe.

```java
    static int contador = 0;
```

* **De Instância:** Declarada fora de qualquer método, mas dentro de uma classe. Cada objeto tem sua própria cópia.

```java
    int idade;
```

* **Parâmetros:** Variáveis passadas para métodos como entrada.

```java
    void metodo(int numero) {
        System.out.println(numero);
    }
```

### Palavras-chave importantes

* final: Torna uma variável uma constante (valor imutável).
* static: Torna uma variável ou constante compartilhada entre todas as instâncias de uma classe.
* var: Introduzido no Java 10, permite inferência de tipo na declaração (apenas dentro de métodos locais).

### Boas Práticas

* Escolha nomes de variáveis descritivos.
* Sempre inicialize variáveis antes de usá-las.
* Use final para valores que não devem mudar.
* Organize o escopo para limitar o uso desnecessário de memória.