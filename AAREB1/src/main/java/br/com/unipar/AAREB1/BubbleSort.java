package br.com.unipar.AAREB1;

public class BubbleSort {

    public void BubbleSort(int[] vet, int aux, int i, int nv) {
        //Ap�s recebido os valores do vetor ir� informar os n�meros do modo que est�o
        System.out.println(nv + "th Vetor desordenado: ");
        for (i = 0; i < 9; i++) {
            System.out.print(" " + vet[i] + ",");
        }
        System.out.println("\n");

        for (i = 0; i < 9; i++) {
            for (int j = 0; j < 8; j++) {
                if (vet[j] > vet[j + 1]) { //Far� a verifica��o se o vetor atual � menor que o vetor + 1
                    aux = vet[j];//Caso verdadeiro o auxiliar recebe o valor de vetor atual
                    vet[j] = vet[j + 1];//troca-se o vetor atual pelo vetor + 1(pr�ximo vetor)
                    vet[j + 1] = aux;//Retorna o auxiliar para o vetro + 1 (passa ele para frente)
                }
            }
        }
        System.out.println(nv + "th Vetor organizado:");
        for (i = 0; i < 9; i++) {//Imprime todos os vetores j� organizados
            System.out.print(" " + vet[i] + ",");
        }
        System.out.println("\n");
        
    }
}
