## Tipos Primitivos

Os tipos primitivos em Java são os blocos básicos de construção para o armazenamento de dados simples. Eles são pré-definidos pela linguagem e não dependem de classes ou objetos. Java oferece oito tipos primitivos, cada um com características específicas em termos de tamanho e valores que podem armazenar.

### Características Gerais dos Tipos Primitivos

* São tipos de dados básicos:
    * Servem para armazenar valores simples, como números, caracteres e valores lógicos.
    * Não possuem métodos ou funcionalidades adicionais.

* Alocação eficiente de memória:
    * São armazenados diretamente na pilha de memória (stack), permitindo acesso rápido e eficiente.
    
* Não utilizam referências:
    * Diferentemente dos tipos por referência, os tipos primitivos armazenam diretamente os valores, sem apontar para objetos na memória.

* Imutabilidade:
    * O valor de um tipo primitivo pode ser alterado, mas ele sempre armazena dados do mesmo tipo.

### Os Oito Tipos Primitivos

* **byte**
    * Tamanho: 8 bits (1 byte).
    * Valores possíveis: -128 a 127.
    * Uso típico: Manipulação de dados em blocos compactos, como em sistemas de arquivos ou fluxos de dados (streams).

* **short**
    * Tamanho: 16 bits (2 bytes).
    * Valores possíveis: -32.768 a 32.767.
    * Uso típico: Armazenar números pequenos onde a economia de memória é importante.

* **int**
    * Tamanho: 32 bits (4 bytes).
    * Valores possíveis: -2³¹ a 2³¹-1 (-2.147.483.648 a 2.147.483.647).
    * Uso típico: Armazenar números inteiros em aplicações gerais. É o tipo padrão para números inteiros.

* **long**
    * Tamanho: 64 bits (8 bytes).
    * Valores possíveis: -2⁶³ a 2⁶³-1.
    * Uso típico: Armazenar valores inteiros muito grandes, como identificadores únicos ou cálculos financeiros.

* **float**
    * Tamanho: 32 bits (4 bytes).
    * Valores possíveis: Aproximadamente ±3,40282347E+38F.
    * Precisão: 7 casas decimais significativas.
    * Uso típico: Números decimais para aplicações onde a precisão não é crítica, como cálculos gráficos.

* **double**

    * Tamanho: 64 bits (8 bytes).
    * Valores possíveis: Aproximadamente ±1,79769313486231570E+308.
    * Precisão: 15-16 casas decimais significativas.
    * Uso típico: Cálculos numéricos que exigem maior precisão, como operações científicas e financeiras.

* **char**
    * Tamanho: 16 bits (2 bytes).
    * Valores possíveis: Representa um único caractere Unicode (0 a 65.535).
    * Uso típico: Armazenar letras, números ou símbolos como caracteres.

* **boolean**
    * Tamanho: 1 bit (não especificado oficialmente, mas representa apenas true ou false).
    * Valores possíveis: true ou false.
    * Uso típico: Controle de fluxo, condições lógicas e flags.

### Tabela Resumida dos Tipos Primitivos

| Tipo | Tamanho | Valor Mínimo | Valor Máximo | Valores Exemplares |
| ---- | ------- | ------------ | ------------ | ------------------ |
| byte | 8 bits | -128 | 127 | byte b = 100; |
| short | 16 bits | -32.768 | 32.767 | short s = 30000; |
| int | 32 bits | -2³¹ | 2³¹-1 | int i = 2000000; |
| long | 64 bits | -2⁶³ | 2⁶³-1 | long l = 9223372036854775807L; | 
| float | 32 bits | ±1.4E-45 | ±3.40282347E+38 | float f = 3.14F; |
| double | 64 bits | ±4.9E-324 | ±1.79769313486231570E+308 | double d = 3.14159; | 
| char | 16 bits | '\u0000' | '\uffff' | char c = 'A'; |
| boolean | 1 bit | false | true | boolean b = true; |

### Conversão entre Tipos Primitivos

* **Conversão Implícita (Widening Casting):**
    * Converte automaticamente um tipo menor para um maior.

    ```java
        int x = 10;
        double y = x; // int para double
    ```

* **Conversão Explícita (Narrowing Casting):**
    * Requer a conversão manual quando um tipo maior é convertido para um menor.

    ```java
        double x = 10.99;
        int y = (int) x; // double para int
    ```

### Boas Práticas com Tipos Primitivos

* Use o tipo mais apropriado para a tarefa:
    * Use int para inteiros (a menos que precise de byte ou long).
    * Use double como padrão para números decimais, a menos que a precisão seja menos importante, onde float pode ser usado.
* Evite erros de arredondamento com float e double em cálculos financeiros. Nesses casos, prefira classes como BigDecimal.
* Sempre inicialize as variáveis antes de usá-las. Diferentemente de tipos por referência, variáveis primitivas não possuem valores padrão fora de classes.
* Trabalhe com boolean para condições, em vez de valores numéricos como 0 ou 1 (comum em outras linguagens).