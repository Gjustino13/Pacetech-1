algoritmo "Fahrenheit para Celsius"
// Fun��o : Converter temperatura em �Fahrenheit para �Celsius. Vers�o aprimorada
// Autores : Sylvio e equipe
// Data : 22/02/2022
// Se��o de Declara��es 
var
tempCelsius, tempFahrenheit: real  // Melhor defini��o dos nomes das vari�veis

inicio

escreval("Digite a temperatura em Fahrenheit: ")
leia(tempFahrenheit)

tempCelsius <- (tempFahrenheit - 32) / 1.8
escreval("A temperatura em Celsius �: ", tempCelsius:2:2, "�C")  // Formata��o de sa�da do resultado

se tempCelsius <= 15 entao
   escreval("Est� frio!")
senao
     se  tempCelsius < 28 entao
         escreval("Est� agrad�vel!")
         senao
              escreval("Est� calor!")
     fimse
fimse

fimalgoritmo
