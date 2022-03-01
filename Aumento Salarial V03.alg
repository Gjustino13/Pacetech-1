algoritmo "Aumento Salarial - 2ª Versão"
// Função : Calcular o valor de um salário após um percentual de aumento, tendo como entradas
// o salário base e o reajuste salarial em porcentagem.
// Autor : Pacer Sylvio Carneiro Júnior - sylviocjr.dev@gmail.com - Blumenau, SC - Brasil.
// Data : 01/03/2022.

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
