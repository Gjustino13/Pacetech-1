algoritmo "Conversor de temperaturas e moedas"
// Fun��o : Converter unidades monet�rias (R$, US$) e de temperaturas (�C, �F)
// Autor : Pacer Sylvio Carneiro J�nior
// Data : 26/02/2022

var
cotacaoDolar, tempCelsius, tempFahrenheit, valorReais, valorDolares: real
continuar: logico
opcao1, opcao2: literal

inicio
escreval()
escreval("Ol�! Bem vindo ao Pacetech Traveler's Help!")
escreval()
escreva("Informe a cota��o do D�lar Americano: ")
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
    escreval(" 3 - Moeda: Reais(R$) para D�lar(US$)")
    escreval()
    escreval(" 4 - Moeda: D�lar(US$) para Reais(R$)")
    escreval()
    escreval(" 5 - Encerrar")
    escreval()
    escreval("========================================")
    escreval()
    escreva("Informe a op��o que deseja: ")

    leia (opcao1)
    escreval()

    escolha opcao1

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

        caso "3"
            escreva("Informe o valor em Reais(R$): ")
            leia(valorReais)
            valorDolares <- valorReais / cotacaoDolar
            escreval("R$ ", valorReais:2:2, " equivale(m) a US$ ", valorDolares:2:2, " de acordo com a cota��o atual.")

        caso "4"
            escreva("Informe o valor em D�lares(US$): ")
            leia(valorDolares)
            valorReais <- valorDolares * cotacaoDolar
            escreval("US$ ", valorDolares:2:2, " equivale(m) a R$ ", valorReais:2:2, " de acordo com a cota��o atual.")

        caso "5"
            interrompa

        outrocaso
           limpatela
           escreval()
           escreval("Erro! Informe uma op��o do menu ...")

    fimescolha

repita
escreval()
escreva("Deseja voltar ao menu inicial? (s - sim / n - n�o) ")
    leia(opcao2)
ate (opcao2 = "n") ou (opcao2 = "s") // Rotina de valida��o de input para
// o caso de o usu�rio optar ou n�o por nova convers�o.

se (opcao2 = "n") entao
    continuar <- Falso
senao
    limpatela
fimse

ate (opcao1 = "5") ou (continuar = Falso)

// Tela de finaliza��o do programa
limpatela
escreval()
escreval("A Pacetech te deseja uma boa viagem!")
escreval("Pacetech Traveler's Help! - Vers�o 1.0 2022")

fimalgoritmo
