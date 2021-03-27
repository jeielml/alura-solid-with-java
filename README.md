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

* \#Critica2:
  * A estrutura apresentada força a existẽncia de um parâmetro nunca tulizado na classe ValidacaoPeriodicidadeEntreReajustes.java
  * Questionamento à Alura: https://cursos.alura.com.br/forum/topico-aula-3-atividade-2-extraindo-validacoes-acoplamento-149254
  
### Atividade 4: Open Closed Principal
* "Não é preciso realizar uma cirurgia de peito aberto para colocar um casaco"
  * "Entidades de software (classes, módulos, funções, etc.) devem estar abertas para extensão, porém fechadas para modificação" -Bertrand Meyer


Nesta aula, aprendemos:

* Que cada classe deve conhecer e ser responsável por suas próprias regras de negócio;
* Que o princípio Aberto/Fechado (OCP) diz que um sistema deve ser aberto para a extensão, mas fechado para a modificação
  * Isso significa que devemos poder criar novas funcionalidades e estender o sistema sem precisar modificar muitas classes já existentes
* Uma classe que tende a crescer "para sempre" é uma forte candidata a sofrer alguma espécie de refatoração.




----

# Sugestão de conteúdo complementar:

* SOLID fica FÁCIL com Essas Ilustrações - Filipe Deschamps
  * https://www.youtube.com/watch?v=6SfrO3D4dHM
  
* The S.O.L.I.D Principles in Pictures
  * https://medium.com/backticks-tildes/the-s-o-l-i-d-principles-in-pictures-b34ce2f1e898
  
* SOLID (O básico para você programar melhor) // Dicionário do Programador
 * https://www.youtube.com/watch?v=mkx0CdWiPRA

* Princípios SOLID em uma API REST com Node.js e TypeScript | Code/Drops #44
  * https://www.youtube.com/watch?v=vAV4Vy4jfkc