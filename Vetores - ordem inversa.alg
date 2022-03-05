algoritmo "Vetores - Ordem Inversa"
// Função : Dado um vetor, reorganizá-lo em ordem inversa, conforme proposto
// em vídeo-aula Vetores II.
// Autor : Pacer Sylvio Carneiro Júnior
// Data : 05/03/2022
// Seção de Declarações 
var

i: inteiro // variável "mecânica"
vetorNumeros1: vetor [1..10] de inteiro
vetorNumeros2: vetor [1..10] de inteiro

inicio

para i de 1 ate 10 faca
    escreva("Insira o", i, "º número: ")
    leia (vetorNumeros1[i])
    vetorNumeros2[11-i] <- vetorNumeros1[i]
fimpara

escreva("Segundo vetor: ")

para i de 1 ate 10 faca
    escreva(vetorNumeros2[i])
fimpara

fimalgoritmo
