algoritmo "Fahrenheit para Celsius"
// Função : Converter temperatura em ºFahrenheit para ºCelsius. Versão aprimorada
// Autores : Sylvio e equipe
// Data : 22/02/2022
// Seção de Declarações 
var
tempCelsius, tempFahrenheit: real  // Melhor definição dos nomes das variáveis

inicio

escreval("Digite a temperatura em Fahrenheit: ")
leia(tempFahrenheit)

tempCelsius <- (tempFahrenheit - 32) / 1.8
escreval("A temperatura em Celsius é: ", tempCelsius:2:2, "ºC")  // Formatação de saída do resultado

se tempCelsius <= 15 entao
   escreval("Está frio!")
senao
     se  tempCelsius < 28 entao
         escreval("Está agradável!")
         senao
              escreval("Está calor!")
     fimse
fimse

fimalgoritmo
