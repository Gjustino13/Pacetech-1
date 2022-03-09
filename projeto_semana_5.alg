algoritmo "Conversor de temperaturas V.02"
// Função : Converter temperaturas entre as escalas Celsius e Fahrenheit
// Autor : Pacer Sylvio Carneiro Júnior
// Data : 07/03/2022

var
opcao: literal
tempCelsius, tempFahrenheit: real  // Variáveis globais. Serão usadas em mais de uma função/procedimento.


procedimento criarMenu()
inicio
    escreval()
    escreval("Olá! Bem vindo ao Pacetech Traveler's Help!")
    escreval()
    escreval("=============== MENU ===============")
    escreval("1 - Celsius para Fahrenheit")
    escreval("2 - Fahrenheit para Celsius")
    escreval("3 - Registro diário de temperaturas")
    escreval("4 - Sair ")
    escreval("====================================")
    escreval()
    escreva("Informe a opção que deseja: ")
    leia(opcao)
fimprocedimento


funcao celsiusParaFahrenheit(tempCelsius: real): real
inicio
    retorne(1.8 * tempCelsius + 32)
fimfuncao


funcao fahrenheitParaCelsius(tempFahrenheit: real): real
inicio
    retorne(tempFahrenheit - 32) / 1.8
fimfuncao


procedimento registrarTemperaturas()
var
i,j,aux: inteiro
hora: vetor[1..4] de inteiro
temperaturas: vetor[1..4] de inteiro
inicio
    para i de 1 ate 4 faca
        escreval()
        escreva("Informe a hora da temperatura observada: ")
        leia(hora[i])
        escreva("Informe a temperatura em ºC observada: ")
        leia(temperaturas[i])
    fimpara

    para i de 1 ate 4 faca
        para j de 1 ate 4 faca
            se temperaturas[j] > temperaturas[i] entao
                aux <- temperaturas[i]
                temperaturas[i] <- temperaturas[j]
                temperaturas[j] <- aux
                
                aux <- hora[i]
                hora[i] <- hora[j]
                hora[j] <- aux
            fimse
        fimpara
    fimpara

    escreval()
    para i de 1 ate 4 faca
        escreval("Temperatura", temperaturas[i], "ºC, registrada às", hora[i], "h, corresponde a ", celsiusParaFahrenheit(temperaturas[i]):2:2, "ºF.")
    fimpara
fimprocedimento


inicio  // Início do programa ...

repita

    criarMenu()
    escolha(opcao)

    caso "1"
        escreval()
        escreva("Informe a temperatura em ºCelsius: ")
        leia (tempCelsius)
        escreval()
        escreval(tempCelsius, "ºC equivale(m) a ", celsiusParaFahrenheit(tempCelsius):2:2, "ºF.")


    caso "2"
        escreval()
        escreva("Informe a temperatura em ºFahrenheit: ")
        leia (tempFahrenheit)
        escreval()
        escreval(tempFahrenheit, "ºF equivale(m) a ", fahrenheitParaCelsius(tempFahrenheit):2:2, "ºC.")

    caso "3"
        registrarTemperaturas()

    caso "4"
        interrompa

    outrocaso
        escreval("==> Opção inválida !!")

    fimescolha
ate opcao = "4"

fimalgoritmo
