algoritmo "Vetores - Ordem Inversa"
// Fun��o : Dado um vetor, reorganiz�-lo em ordem inversa, conforme proposto
// em v�deo-aula Vetores II.
// Autor : Pacer Sylvio Carneiro J�nior
// Data : 05/03/2022
// Se��o de Declara��es 
var

i: inteiro // vari�vel "mec�nica"
vetorNumeros1: vetor [1..10] de inteiro
vetorNumeros2: vetor [1..10] de inteiro

inicio

para i de 1 ate 10 faca
    escreva("Insira o", i, "� n�mero: ")
    leia (vetorNumeros1[i])
    vetorNumeros2[11-i] <- vetorNumeros1[i]
fimpara

escreva("Segundo vetor: ")

para i de 1 ate 10 faca
    escreva(vetorNumeros2[i])
fimpara

fimalgoritmo
