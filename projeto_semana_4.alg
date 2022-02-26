algoritmo "Conversor de temperaturas e moedas"
// Função : Converter unidades monetárias (R$, US$) e de temperaturas (ºC, ºF)
// Autor : Pacer Sylvio Carneiro Júnior
// Data : 26/02/2022

var
cotacaoDolar, tempCelsius, tempFahrenheit, valorReais, valorDolares: real
continuar: logico
opcao1, opcao2: literal

inicio
escreval()
escreval("Olá! Bem vindo ao Pacetech Traveler's Help!")
escreval()
escreva("Informe a cotação do Dólar Americano: ")
leia (cotacaoDolar)

continuar <- verdadeiro

repita

    escreval()
    escreval("================= MENU =================")
    escreval()
    escreval(" 1 - Temperatura: Celsius para Fahrenheit")
    escreval()
    escreval(" 2 - Temperatura: Fahrenheit para Celsius")
    escreval()
    escreval(" 3 - Moeda: Reais(R$) para Dólar(US$)")
    escreval()
    escreval(" 4 - Moeda: Dólar(US$) para Reais(R$)")
    escreval()
    escreval(" 5 - Encerrar")
    escreval()
    escreval("========================================")
    escreval()
    escreva("Informe a opção que deseja: ")

    leia (opcao1)
    escreval()

    escolha opcao1

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

        caso "3"
            escreva("Informe o valor em Reais(R$): ")
            leia(valorReais)
            valorDolares <- valorReais / cotacaoDolar
            escreval("R$ ", valorReais:2:2, " equivale(m) a US$ ", valorDolares:2:2, " de acordo com a cotação atual.")

        caso "4"
            escreva("Informe o valor em Dólares(US$): ")
            leia(valorDolares)
            valorReais <- valorDolares * cotacaoDolar
            escreval("US$ ", valorDolares:2:2, " equivale(m) a R$ ", valorReais:2:2, " de acordo com a cotação atual.")

        caso "5"
            interrompa

        outrocaso
           limpatela
           escreval()
           escreval("Erro! Informe uma opção do menu ...")

    fimescolha

repita
escreval()
escreva("Deseja voltar ao menu inicial? (s - sim / n - não) ")
    leia(opcao2)
ate (opcao2 = "n") ou (opcao2 = "s") // Rotina de validação de input para
// o caso de o usuário optar ou não por nova conversão.

se (opcao2 = "n") entao
    continuar <- Falso
senao
    limpatela
fimse

ate (opcao1 = "5") ou (continuar = Falso)

// Tela de finalização do programa
limpatela
escreval()
escreval("A Pacetech te deseja uma boa viagem!")
escreval("Pacetech Traveler's Help! - Versão 1.0 2022")

fimalgoritmo
