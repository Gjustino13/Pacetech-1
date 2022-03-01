algoritmo "Aumento Salarial - 2ª Versão"
// Função : Retornar o valor de um salário informado com um incremento de 30%
// Autor : Sylvio Carneiro Júnior - sylviocjr.dev@gmail.com - Blumenau, SC - Brasil
// Data : 18/02/2022

var

   salario: real
   aumento: inteiro

inicio

escreva("Informe o seu salário atual: ")
leia(salario)
escreva("Qual será o percentual de aumento? (%) ")
leia(aumento)  // Sugestão do professor de implantar rotina de leitura do percentual de aumento.
escreval("Seu salário, após o aumento de ", aumento, "%, será de R$", salario*(1 + aumento/100))

fimalgoritmo
