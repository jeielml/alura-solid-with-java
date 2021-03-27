# SOLID com Java: Princípios da programação orientada a objetos

https://cursos.alura.com.br/course/solid-orientacao-objetos-java
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

## Aula 4: Herança Indesejada

### Atividade 2: Implementando uma nova regra de negócio
* Realizando a progressão de cargo:
  * \#Critica 3: retornar o próprio cargo pode gerar stack over flow caso alguém decida percorrer a progressão de cargos
   * https://cursos.alura.com.br/forum/topico-aula-4-atividade-2-gerente-proximocargo-149258 

### Atividade 3: Utilizando herança da maneira errada

* Um terceirizado possui várias características em comum de um Funcionario.
* Extender Funcionários é um equívoco que gera acoplamento e alguns problemas de comportamento para resolver, como o aumento salarial e a promoção
* O adequado é favorecer composição à herança, para tanto:
  * Extrair os dados comuns entre Terceirizado e Funcionario para uma classe "DadosPessoais"
  * Compor Terceirizado e Funcionario com DadosPessoais
  * Isto remete a "Liskov Substitution Principle"
  
### Atividade 5: Liskov Substitution Principle

  "Se parece com um pato, faz quack como um pato, mas precisa de bateria, então não é um pato, você está usando a abstração errada"

  "Se q(x0 é uma propriedade demonstrável dos objetos x de tipo T, etnaõ q(y) deve ser verdadeiro para objetos y de tipoS, onde S é um subtipo de T", Barbara Liskov"


Nesta aula, aprendemos:

* Que, embora a herança favoreça o reaproveitamento de código, ela pode trazer efeitos colaterais quando não utilizada da maneira correta;
* Que o Princípio de Substituição de Liskov (LSP) diz que devemos poder substituir classes base por suas classes derivadas em qualquer lugar, sem problema.

----
## Aula 5: Trabalhando com abstrações

### Atividade 2: Criando abstrações com interfaces e polimorfismo

Esta aula remete à implementação realizada anteriormente quando em ReajusteService.java, ao invés de instanciar cada validacao, foi criada uma lista do tipo (i)ValidaçãoReajuste.java

### Atividade 3: Dependency Inversion Principle

"Se você quiser ligar uma lâmpada na sua casa, você deveria soldar o fio diretamente na tomada?"

"Abstrações não devem depender de imlementações;
Implementações devem depender de abstrações>"-  Robert (uncle Bob) Martin

### Atividade 5: Interface Segregation Principle

" Uma classe não deveria ser forçada a depender de métodos que não utilizará" -  Roberto (uncle Bob) Martin

Ex> Interface Reajuste x Reajuste Tributável





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