algoritmo "Aumento Salarial - 2� Vers�o"
// Fun��o : Retornar o valor de um sal�rio informado com um incremento de 30%
// Autor : Sylvio Carneiro J�nior - sylviocjr.dev@gmail.com - Blumenau, SC - Brasil
// Data : 18/02/2022

var

   salario: real
   aumento: inteiro

inicio

aumento <- 30  // Possibilita ajustar nessa atribui��o o percentual de aumento
escreva("Informe o seu sal�rio atual: ")
leia(salario)
escreval("Seu sal�rio, ap�s o aumento de ", aumento, "%, ser� de R$", salario*(1 + aumento/100))

fimalgoritmo
