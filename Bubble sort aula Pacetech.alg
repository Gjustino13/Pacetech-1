algoritmo "Bubble sort"
// Fun��o : Ordena��o de vetores, listas etc. Algoritmo apresentado na aula da
// 5� semana do curso da Pacetech
// Autor : Tamb�m n�o fui eu rsrsrs ! Aula do curso Pacetech 5� semana.
// Pequenas adapta��es nas rotinas de interface feitas por mim, Pacer Sylvio C. Jr.
// Data : 06/03/2022

var

numeros: vetor[1..10] de inteiro
aux, i, j: inteiro

inicio

// Preenchimento do vetor ...
para i de 1 ate 10 faca
    escreva("Digite o", i, "� n�mero: ")
    leia(numeros[i])
fimpara

para i de 1 ate 10 faca
    para j de 1 ate 10 faca
        se numeros[j] > numeros[i] entao
            aux <- numeros[i]
            numeros[i] <- numeros[j]
            numeros[j] <- aux
        fimse
    fimpara
fimpara

escreva("Eis a lista ordenada: ")
para i de 1 ate 10 faca
    escreva(numeros[i])
fimpara


fimalgoritmo
