algoritmo "Aumento Salarial - 3� Vers�o"
// Fun��o : Calcular o valor de um sal�rio ap�s um percentual de aumento, tendo como entradas
// o sal�rio base e o reajuste salarial em porcentagem.
// Autor : Pacer Sylvio Carneiro J�nior - sylviocjr.dev@gmail.com - Blumenau, SC - Brasil.
// Data : 01/03/2022.

var

   salario: real
   aumento: inteiro

inicio

escreva("Informe o seu sal�rio atual: ")
leia(salario)
escreva("Qual ser� o percentual de aumento? (%) ")
leia(aumento)  // Sugest�o do professor de implantar rotina de leitura do percentual de aumento.
escreval("Seu sal�rio, ap�s o aumento de ", aumento, "%, ser� de R$", salario*(1 + aumento/100))

fimalgoritmo
