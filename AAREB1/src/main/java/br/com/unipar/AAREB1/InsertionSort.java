package br.com.unipar.AAREB1;

public class InsertionSort {

    public static void insertionSort(int[] vetor, int nv) {

        int j;
        int key;
        int i;
        //Ap�s recebido os valores do vetor ir� informar os n�meros do modo que est�o
        System.out.println(nv + "th Vetor desordenado: ");
        for (i = 0; i < 9; i++) {
            System.out.print(" " + vetor[i] + ",");
        }
        System.out.println("\n");

        //Ir� percorrer todo o vetor come�ando do segundo elemento e 
        //atribuindo o mesmo a uma vari�vel chamada key
        for (j = 1; j < vetor.length; j++) {//O algoritmo come�a fazendo uma itera��o em todos os elementos do vetor, a partir do segundo elemento, por isso j=1 e n�o j=0.
            key = vetor[j];//A vari�vel key armazena inicialmente o primeiro valor lido pelo la�o for, que no caso ser� o segundo elemento do vetor.
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {// o loop continuar� at� que o valor de i seja maior ou igual a zero e o valor do vetor na posi��o i seja maior que o valor de key.
                vetor[i + 1] = vetor[i];//O valor do segundo elemento recebe o vetor atual
            }
            vetor[i + 1] = key;//proximo vetor � a key
        }
        System.out.println("Vetor organizado:");
        for (i = 0; i < 9; i++) {//Imprime todos os vetores j� organizados
            System.out.print(" " + vetor[i] + ",");
        }
        System.out.println("\n");
    }
}
