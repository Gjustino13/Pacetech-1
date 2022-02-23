algoritmo "Fahrenheit para Celsius"
// Função : Converter temperatura em ºFahrenheit para ºCelsius.
// Autores : Sylvio e equipe
// Data : 22/02/2022
// Seção de Declarações 
var
tc, tf: real

inicio

escreval("Digite a temperatura em Fahrenheit: ")
leia(tf)

tc <- (tf - 32) / 1.8
escreval("A temperatura em Celsius é :", tc, "ºC")

se tc <= 15 entao
   escreval("Está frio!")
senao
     se  tc < 28 entao
         escreval("Está agradável!")
         senao
              escreval("Está calor!")
     fimse
fimse

fimalgoritmo
