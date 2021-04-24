package br.com.unipar.AAREB1;

public class InsertionSort {

    public static void insertionSort(int[] vetor, int nv) {

        int j;
        int key;
        int i;
        //Após recebido os valores do vetor irá informar os números do modo que estão
        System.out.println(nv + "th Vetor desordenado: ");
        for (i = 0; i < 9; i++) {
            System.out.print(" " + vetor[i] + ",");
        }
        System.out.println("\n");

        //Irá percorrer todo o vetor começando do segundo elemento e 
        //atribuindo o mesmo a uma variável chamada key
        for (j = 1; j < vetor.length; j++) {//O algoritmo começa fazendo uma iteração em todos os elementos do vetor, a partir do segundo elemento, por isso j=1 e não j=0.
            key = vetor[j];//A variável key armazena inicialmente o primeiro valor lido pelo laço for, que no caso será o segundo elemento do vetor.
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {// o loop continuará até que o valor de i seja maior ou igual a zero e o valor do vetor na posição i seja maior que o valor de key.
                vetor[i + 1] = vetor[i];//O valor do segundo elemento recebe o vetor atual
            }
            vetor[i + 1] = key;//proximo vetor é a key
        }
        System.out.println("Vetor organizado:");
        for (i = 0; i < 9; i++) {//Imprime todos os vetores já organizados
            System.out.print(" " + vetor[i] + ",");
        }
        System.out.println("\n");
    }
}
