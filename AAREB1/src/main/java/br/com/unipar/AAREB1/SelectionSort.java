package br.com.unipar.AAREB1;

public class SelectionSort {

    public void selectionSort(int[] vet, int i, int nv) {
        //Ap�s recebido os valores do vetor ir� informar os n�meros do modo que est�o
        System.out.println(nv + "th Vetor desordenado: ");
        for (i = 0; i < 9; i++) {
            System.out.print(" " + vet[i] + ",");

        }
        System.out.print("\n");
        int j;

        for (i = 0; i < vet.length; i++) {
            // min � o �ndice do menor elemento com um �ndice maior ou igual a i
            int min = i;
            for (j = i + 1; j < vet.length; j++) {
                if (vet[j] < vet[min]) {
                    min = j;
                }
            }
            // Trocando o valor de vet[i] para vet[min]
            int swap = vet[i];
            vet[i] = vet[min];
            vet[min] = swap;
        }
        System.out.println("Vetor organizado:");
        for (i = 0; i < 9; i++) {//Imprime todos os vetores j� organizados
            System.out.print(" " + vet[i] + ",");
        }
        System.out.println("\n");
    }

}
