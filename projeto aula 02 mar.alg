algoritmo "Conversor de temperaturas e moedas"
// Fun��o : Converter unidades de temperaturas (�C, �F)
// Autor : Pacer Sylvio Carneiro J�nior / Kairos Chiodini/ Phederic Brendel
// Data : 02/03/2022

var
tempCelsius, tempFahrenheit: real
i: inteiro
opcao: literal

inicio
escreval()








    escreval()
    escreval("================= MENU =================")
    escreval()
    escreval(" 1 - Temperatura: Celsius para Fahrenheit")
    escreval()
    escreval(" 2 - Temperatura: Fahrenheit para Celsius")
    escreval()

    escreval("========================================")
    escreval()
    escreva("Informe a op��o que deseja: ")

    leia (opcao)

    escolha opcao

        caso "1"
            escreva("Informe a temperatura em �Celsius: ")
            leia (tempCelsius)
            tempFahrenheit <- 1.8 * tempCelsius + 32
            escreval(tempCelsius, "�C equivale(m) a ", tempFahrenheit:2:2, "�F.")


        caso "2"
            escreva("Informe a temperatura em �Fahrenheit: ")
            leia(tempFahrenheit)
            tempCelsius <- (tempFahrenheit - 32) / 1.8
            escreval(tempFahrenheit, "�F equivale(m) a ", tempCelsius:2:2, "�C.")



        outrocaso
           limpatela
           escreval()
           escreval("Erro! Informe uma op��o do menu ...")


    fimescolha

escreval()

para i de 1 ate 100 faca

     tempFahrenheit <- 1.8 * i + 32
     escreval(i, "�C equivale(m) a ", tempFahrenheit:2:2, "�F.")


fimpara



fimalgoritmo
