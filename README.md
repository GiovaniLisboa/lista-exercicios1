
## Lista de Exercícios
### Programação estruturada

 1. Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
	
        C = (5 * (F-32) / 9)

 2. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:

	 - o produto do dobro do primeiro com metade do segundo.
	 - a soma do triplo do primeiro com o terceiro.
	 - o terceiro elevado ao cubo.

3. Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
	
	a.  Para homens: (72.7*h) - 58
	b.  Para mulheres: (62.1*h) - 44.7 (h = altura)
	c.  Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.

### Estruturas de decisão
4. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
	
	-   A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
	-   A mensagem "Reprovado", se a média for menor do que sete;
	-   A mensagem "Aprovado com Distinção", se a média for igual a dez.

5. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

	- "Telefonou para a vítima?"
	- "Esteve no local do crime?"
	- "Mora perto da vítima?"
	- "Devia para a vítima?"
	- "Já trabalhou com a vítima?"  

	O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

6. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
	
	-   Desconto do IR:
	-   Salário Bruto até 900 (inclusive) - isento
	-   Salário Bruto até 1500 (inclusive) - desconto de 5%
	-   Salário Bruto até 2500 (inclusive) - desconto de 10%
	-   Salário Bruto acima de 2500 - desconto de 20%  Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
    
            Salário Bruto: (5 * 220)        : R$ 1100,00
            (-) IR (5%)                     : R$   55,00  
            (-) INSS ( 10%)                 : R$  110,00
            FGTS (11%)                      : R$  121,00
            Total de descontos              : R$  165,00
            Salário Liquido                 : R$  935,00

### Estruturas de repetição

7. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
		
	- Tabuada de 5
		
	        5 X 1 = 5
	        5 X 2 = 10
	        ...
	        5 X 10 = 50

8. Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.

9.  O cardápio de uma lanchonete é o seguinte:

        Especificação   Código  Preço
        Cachorro Quente 100     R$ 1,20
        Bauru Simples   101     R$ 1,30
        Bauru com ovo   102     R$ 1,50
        Hambúrguer      103     R$ 1,20
        Cheeseburguer   104     R$ 1,30
        Refrigerante    105     R$ 1,00
    
    Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido. Considere que o cliente deve informar quando o pedido deve ser encerrado.
    
### Strings

10. Faça um programa que leia 2 strings e informe o conteúdo delas seguido do seu comprimento. Informe também se as duas strings possuem o mesmo comprimento e são iguais ou diferentes no conteúdo.

-   Compara duas strings

	    String 1: Brasil Hexa 2006
	    String 2: Brasil! Hexa 2006!
	    Tamanho de "Brasil Hexa 2006": 16 caracteres
	    Tamanho de "Brasil! Hexa 2006!": 18 caracteres
	    As duas strings são de tamanhos diferentes.
	    As duas strings possuem conteúdo diferente.

 11. **Nome na vertical em escada.** Faça um programa que solicite o nome do usuário e imprima-o em formato de escada.

		F
	    FU
	    FUL
	    FULA
	    FULAN
	    FULANO

12. Um palíndromo é uma seqüência de caracteres cuja leitura é idêntica se feita da direita para esquerda ou vice−versa. Por exemplo: **OSSO** e **OVO** são palíndromos. Em textos mais complexos os espaços e pontuação são ignorados. A frase **SUBI NO ONIBUS** é o exemplo de uma frase palíndroma onde os espaços foram ignorados. Faça um programa que leia uma seqüência de caracteres, mostre−a e diga se é um palíndromo ou não.

### Funções

 13. Faça uma função que retorne o reverso de um número inteiro informado.  Por exemplo: 
		 
		 127 -> 721.

 14.  Faça uma função que informe a quantidade de dígitos de um determinado número inteiro informado.
 15. Faça um programa de implemente um jogo de Craps. O jogador lança um par de dados, obtendo um valor entre 2 e 12. Se, na primeira jogada, você tirar 7 ou 11, você um "natural" e ganhou. Se você tirar 2, 3 ou 12 na primeira jogada, isto é chamado de "craps" e você perdeu. Se, na primeira jogada, você fez um 4, 5, 6, 8, 9 ou 10,este é seu "Ponto". Seu objetivo agora é continuar jogando os dados até tirar este número novamente. Você perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente.

### Listas

 16. Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.
 17. Faça um programa que leia um número indeterminado de valores, correspondentes a notas, encerrando a entrada de dados quando for informado um valor igual a -1 (que não deve ser armazenado). Após esta entrada de dados, faça:

	 - Mostre a quantidade de valores que foram lidos;
	 - Exiba todos os valores na ordem em que foram informados, um ao lado  
	   do outro;
	 -  Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;
	 - Calcule e mostre a soma dos valores;
	 -  Calcule e mostre a média dos valores;
	 - Calcule e mostre a quantidade de valores acima da média calculada;
	 - Calcule e mostre a quantidade de valores abaixo de sete;
	 - Encerre o programa com uma mensagem;

 18. Em uma competição de salto em distância cada atleta tem direito a cinco saltos. O resultado do atleta será determinado pela média dos cinco valores restantes. Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos e depois informe o nome, os saltos e a média dos saltos. O programa deve ser encerrado quando não for informado o nome do atleta. A saída do programa deve ser conforme o exemplo abaixo:

			Atleta: Rodrigo Curvêllo
			 
			Primeiro Salto: 6.5 m
			Segundo Salto: 6.1 m
			Terceiro Salto: 6.2 m
			Quarto Salto: 5.4 m
			Quinto Salto: 5.3 m
			Resultado final:
			Atleta: Rodrigo Curvêllo
			Saltos: 6.5 - 6.1 - 6.2 - 5.4 - 5.3
			Média dos saltos: 5.9 m
    
### Extra
 19. Uma empresa de pesquisas precisa tabular os resultados da seguinte enquete feita a um grande quantidade de organizações:

        "Qual o melhor Sistema Operacional para uso em servidores?"
        As possíveis respostas são:
        1- Windows Server
        2- Unix
        3- Linux
        4- Netware
        5- Mac OS
        6- Outro
	
Você foi contratado para desenvolver um programa que leia o resultado da enquete e informe ao final o resultado da mesma. O programa deverá ler os valores até ser informado o valor 0, que encerra a entrada dos dados. Não deverão ser aceitos valores além dos válidos para o programa (0 a 6). Os valores referentes a cada uma das opções devem ser armazenados num vetor. Após os dados terem sido completamente informados, o programa deverá calcular a percentual de cada um dos concorrentes e informar o vencedor da enquete. O formato da saída foi dado pela empresa, e é o seguinte:

        Sistema Operacional     Votos   %
        ------------------------------------
        Windows Server           1500   17%
        Unix                     3500   40%
        Linux                    3000   34%
        Netware                   500    5%
        Mac OS                    150    2%
        Outro                     150    2%
          -----------------------------------------------------
        Total                    8800
        O Sistema Operacional mais votado foi o Unix, com 3500 votos, correspondendo a 40% dos votos.

20. A ACME Inc., uma empresa de 500 funcionários, está tendo problemas de espaço em disco no seu servidor de arquivos. Para tentar resolver este problema, o Administrador de Rede precisa saber qual o espaço ocupado pelos usuários, e identificar os usuários com maior espaço ocupado. Através de um programa, baixado da Internet, ele conseguiu gerar o seguinte arquivo, chamado "usuarios.txt":
    
        alexandre       456123789
        anderson        1245698456
        antonio         123456456
        carlos          91257581
        cesar           987458
        rosemary        789456125
    
    Neste arquivo, o nome do usuário possui 15 caracteres. A partir deste arquivo, você deve criar um programa que gere um relatório, chamado "relatório.txt", no seguinte formato:
    
        ACME Inc.               Uso do espaço em disco pelos usuários
        -----------------------------------------------------------------------
        Nr.  Usuário        Espaço utilizado     % do uso
        1    alexandre       434,99 MB             16,85%
        2    anderson       1187,99 MB             46,02%
        3    antonio         117,73 MB              4,56%
        4    carlos           87,03 MB              3,37%
        5    cesar             0,94 MB              0,04%
        6    rosemary        752,88 MB             29,16%
        Espaço total ocupado: 2581,57 MB
        Espaço médio ocupado: 430,26 MB
    
    O arquivo de entrada deve ser lido uma única vez, e os dados armazenados em memória, caso sejam necessários, de forma a agilizar a execução do programa. A conversão da espaço ocupado em disco, de bytes para megabytes deverá ser feita através de uma função separada, que será chamada pelo programa principal. O cálculo do percentual de uso também deverá ser feito através de uma função, que será chamada pelo programa principal.
