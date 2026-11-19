# Identificação dos 7 Erros — Projeto Autobots

### Erro 1: Índice inválido no laço de repetição

**Onde:** `GerenciadorAutobots.java` — método `calcularEnergonTotal()`.

**Boa prática violada:** Controle correto de estruturas de repetição e prevenção de erros de índice (`IndexOutOfBoundsException`).

**Correção:** Substituí o laço `for` tradicional por um `for-each`, percorrendo diretamente os elementos da lista e evitando acessos a índices inexistentes.

### Erro 2: Comparação incorreta de Strings

**Onde:** `GerenciadorAutobots.java` — método `buscar()`.

**Boa prática violada:** Comparação correta de objetos em Java.

**Correção:** Substituí o operador `==` pelo método `.equals()`, garantindo a comparação do conteúdo das Strings, e não de suas referências na memória.

### Erro 3: Tratamento inadequado de exceções

**Onde:** `GerenciadorAutobots.java` — método `reparar()`.

**Boa prática violada:** Tratamento adequado de exceções e não ocultação de erros.

**Correção:** Removi o bloco `try/catch` vazio e passei a utilizar exceções específicas (`IllegalStateException` e `IllegalArgumentException`), permitindo identificar e comunicar situações inválidas.

### Erro 4: Falta de encapsulamento dos atributos

**Onde:** `Autobot.java` — atributos `n`, `e` e `nivel`.

**Boa prática violada:** Encapsulamento, um dos pilares da Programação Orientada a Objetos (POO).

**Correção:** Modifiquei os atributos de `public` para `private`, implementei métodos getters e centralizei a alteração do energon em um método próprio da classe.

### Erro 5: Utilização de números mágicos

**Onde:** `GerenciadorAutobots.java` — métodos `reparar()` e `classificar()`.

**Boa prática violada:** Clean Code e legibilidade do código.

**Correção:** Substituí os valores numéricos fixos por constantes com nomes descritivos: `ENERGON_REPARO`, `LIMITE_ELITE` e `LIMITE_PADRAO`, facilitando a compreensão e manutenção do código.

### Erro 6: Nomenclatura inadequada de variáveis

**Onde:** `Autobot.java` — atributos `n`, `e` e `nivel`; `GerenciadorAutobots.java` — atributo `lista`.

**Boa prática violada:** Convenções de nomenclatura e legibilidade do código.

**Correção:** Renomeei as variáveis utilizando nomes mais descritivos, como `nome`, `energon`, `nivel` e `listaAutobots`, tornando o código mais compreensível e facilitando sua manutenção.

### Erro 7: Responsabilidades mal distribuídas entre as classes

**Onde:** `GerenciadorAutobots.java` — método `reparar()` e `Autobot.java`.

**Boa prática violada:** Princípio da Responsabilidade Única (SRP) e encapsulamento.

**Correção:** Transferi a lógica de reparo para a classe `Autobot`, fazendo com que o próprio objeto controle a alteração do seu energon. O gerenciador passou a apenas delegar a operação, mantendo suas responsabilidades de gerenciamento.
