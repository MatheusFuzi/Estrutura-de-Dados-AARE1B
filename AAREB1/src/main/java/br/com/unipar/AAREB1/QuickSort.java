package br.com.unipar.AAREB1;

public class QuickSort {

    private static void quickSort(int[] vet, int inicio, int fim) {
        if (inicio < fim) {//Verificar se o item anterior é maior que o pivo
            int posicaoPivo = separar(vet, inicio, fim);
            quickSort(vet, inicio, posicaoPivo - 1);
            quickSort(vet, posicaoPivo + 1, fim);
        }
    }

    private static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo) {
                i++;
            } else if (pivo < vetor[f]) {
                f--;
            } else { //se o item for menor que o pivot troca
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}
