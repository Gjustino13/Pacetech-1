algoritmo "Bubble sort"
// Fun��o : Ordena��o de um vetor, lista, etc.
// Autor : N�o fui eu rsrsrs! Baseado em algoritmo e programa apresentado no curso
// de Introdu��o � C�ncia da Computa��o com Python 2� fase, 5� semana do IME-USP pela
// plataforma Coursera.
// Data : 05/03/2022

var

numeros: vetor[1..10] de inteiro
i, j, aux: inteiro  // Vari�veis "mec�nicas"

inicio

// Preenchimento do vetor ...
para i de 1 ate 10 faca
    escreva("Digite o", i, "� n�mero: ")
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
