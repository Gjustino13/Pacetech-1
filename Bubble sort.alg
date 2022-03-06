algoritmo "Bubble sort"
// Função : Ordenação de um vetor, lista, etc.
// Autor : Não fui eu rsrsrs! Baseado em algoritmo e programa apresentado no curso
// de Introdução à Cência da Computação com Python 2ª fase, 5ª semana do IME-USP pela
// plataforma Coursera.
// Data : 05/03/2022

var

numeros: vetor[1..10] de inteiro
i, j, aux: inteiro  // Variáveis "mecânicas"

inicio

// Preenchimento do vetor ...
para i de 1 ate 10 faca
    escreva("Digite o", i, "º número: ")
    leia(numeros[i])
fimpara

para i de 9 ate 1 passo -1 faca
    para j de 1 ate i faca
        se numeros[j] > numeros[j+1] entao
            aux <- numeros[j]
            numeros[j] <- numeros[j+1]
            numeros[j+1] <- aux
        fimse
    fimpara
fimpara

escreva("Eis a lista ordenada: ")
para i de 1 ate 10 faca
    escreva(numeros[i])
fimpara

fimalgoritmo
