algoritmo "Conversor de temperaturas e moedas"
// Função : Converter unidades de temperaturas (ºC, ºF)
// Autor : Pacer Sylvio Carneiro Júnior / Kairos Chiodini/ Phederic Brendel
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
    escreva("Informe a opção que deseja: ")

    leia (opcao)

    escolha opcao

        caso "1"
            escreva("Informe a temperatura em ºCelsius: ")
            leia (tempCelsius)
            tempFahrenheit <- 1.8 * tempCelsius + 32
            escreval(tempCelsius, "ºC equivale(m) a ", tempFahrenheit:2:2, "ºF.")


        caso "2"
            escreva("Informe a temperatura em ºFahrenheit: ")
            leia(tempFahrenheit)
            tempCelsius <- (tempFahrenheit - 32) / 1.8
            escreval(tempFahrenheit, "ºF equivale(m) a ", tempCelsius:2:2, "ºC.")



        outrocaso
           limpatela
           escreval()
           escreval("Erro! Informe uma opção do menu ...")


    fimescolha

escreval()

para i de 1 ate 100 faca

     tempFahrenheit <- 1.8 * i + 32
     escreval(i, "ºC equivale(m) a ", tempFahrenheit:2:2, "ºF.")


fimpara



fimalgoritmo
