algoritmo "Fahrenheit para Celsius"
// Fun��o : Converter temperatura em �Fahrenheit para �Celsius.
// Autores : Sylvio e equipe
// Data : 22/02/2022
// Se��o de Declara��es 
var
tc, tf: real

inicio

escreval("Digite a temperatura em Fahrenheit: ")
leia(tf)

tc <- (tf - 32) / 1.8
escreval("A temperatura em Celsius � :", tc, "�C")

se tc <= 15 entao
   escreval("Est� frio!")
senao
     se  tc < 28 entao
         escreval("Est� agrad�vel!")
         senao
              escreval("Est� calor!")
     fimse
fimse

fimalgoritmo
