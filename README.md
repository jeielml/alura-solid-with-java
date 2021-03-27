# SOLID com Java: Princípios da programação orientada a objetos

----

## Aula 1: "Orientação a Objetos: Coesão, Encapsulamento e Acoplamento"

Nesta aula, aprendemos:

* Coesão:
  * Uma classe coesa faz bem uma única coisa
  * Classes coesas não devem ter várias responsabilidades
* Encapsulamento:
  * Getters e setters não são formas eficientes de aplicar encapsulamento
  * É interessante fornecer acesso apenas ao que é necessário em nossas classes
  * O encapsulamento torna o uso das nossas classes mais fácil e intuitivo
* Acoplamento:
  * Acoplamento é a dependência entre classes
  * Acoplamento nem sempre é ruim, e que é impossível criar um sistema sem nenhum acoplamento
  * Devemos controlar o nível de acoplamento na nossa aplicação (falaremos mais sobre isso)
  
----

## Aula 2: Melhorando a Coesão

### Atividade 1
* \#Crítica01: A estrutura apresentada na Atividade 1 da Aula dois torna a classe Funcionário anêmica (Anemic Model)
  * Anti pattern: https://www.martinfowler.com/bliki/AnemicDomainModel.html
  * Questionamento à Alura: https://cursos.alura.com.br/forum/topico-aula-2-atividade-1-anti-pattern-anemic-domain-model-149250
  
### Atividade 3
* Single Responsability Principal: "Só porque você pode, não significa que você deve!"

Nesta aula, aprendemos:

* Que classes/métodos/funções/módulos devem ter uma única responsabilidade bem definida;
* Que, segundo o Princípio de Responsabilidade Única (SRP), uma classe deve ter um e apenas um motivo para ser alterada;
* Como realizar uma refatoração no nosso sistema, para aplicar o SRP;
* Como extrair uma classe

----

## Aula 3: Reduzindo o acoplamento

### Atividade 2: Extraindo Validações