package br.com.unipar.AAREB1;

import java.util.Scanner;

public class Main {

    public static void bubblesortexe() {
        BubbleSort selection = new BubbleSort();
        int[] vet = new int[9];

        vet[0] = 21;
        vet[1] = 45;
        vet[2] = 99;
        vet[3] = 20;
        vet[4] = 200;
        vet[5] = 1;
        vet[6] = 34;
        vet[7] = 70;
        vet[8] = 15;
        selection.BubbleSort(vet, 0, 0, 1);

        vet[0] = 45;
        vet[1] = 360;
        vet[2] = 1250;
        vet[3] = 999;
        vet[4] = 99;
        vet[5] = 9;
        vet[6] = 4560;
        vet[7] = 456;
        vet[8] = 2;
        selection.BubbleSort(vet, 0, 0, 2);
        start();
    }

    public static void insertionsortexe() {
        InsertionSort selection = new InsertionSort();
        int[] vetor = new int[9];

        vetor[0] = 21;
        vetor[1] = 45;
        vetor[2] = 99;
        vetor[3] = 20;
        vetor[4] = 200;
        vetor[5] = 1;
        vetor[6] = 34;
        vetor[7] = 70;
        vetor[8] = 15;
        selection.insertionSort(vetor, 1);

        vetor[0] = 45;
        vetor[1] = 360;
        vetor[2] = 1250;
        vetor[3] = 999;
        vetor[4] = 99;
        vetor[5] = 9;
        vetor[6] = 4560;
        vetor[7] = 456;
        vetor[8] = 2;
        selection.insertionSort(vetor, 2);
        start();
    }

    public static void selectionsortexe() {
        SelectionSort selection = new SelectionSort();
        int[] vet = new int[9];

        vet[0] = 21;
        vet[1] = 45;
        vet[2] = 99;
        vet[3] = 20;
        vet[4] = 200;
        vet[5] = 1;
        vet[6] = 34;
        vet[7] = 70;
        vet[8] = 15;
        selection.selectionSort(vet, 0, 1);

        vet[0] = 45;
        vet[1] = 360;
        vet[2] = 1250;
        vet[3] = 999;
        vet[4] = 99;
        vet[5] = 9;
        vet[6] = 4560;
        vet[7] = 456;
        vet[8] = 2;
        selection.selectionSort(vet, 0, 2);
        start();
    }

    public static void quicksortexe() {
        SelectionSort selection = new SelectionSort();
        int[] vet = new int[9];

        vet[0] = 21;
        vet[1] = 45;
        vet[2] = 99;
        vet[3] = 20;
        vet[4] = 200;
        vet[5] = 1;
        vet[6] = 34;
        vet[7] = 70;
        vet[8] = 15;
        selection.selectionSort(vet, vet[0], vet[8]);

        vet[0] = 45;
        vet[1] = 360;
        vet[2] = 1250;
        vet[3] = 999;
        vet[4] = 99;
        vet[5] = 9;
        vet[6] = 4560;
        vet[7] = 456;
        vet[8] = 2;
        selection.selectionSort(vet, vet[0], vet[8]);
        start();
    }

    public static void start() {
        int option;
        System.out.println("|         Escolha um metodo de Ordenacao    ou     5 - sair              |");
        System.out.println("| 1- Bubble Sort | 2- Insertion Sort | 3- Selection Sort | 4- Quick Sort |");
        Scanner read = new Scanner(System.in);
        option = read.nextInt();
        switch (option) {
            case 1:
                long tempoInicial = System.currentTimeMillis();
                bubblesortexe();
                long tempoFinal = System.currentTimeMillis();
                System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
                System.out.println(" ");
                break;
            case 2:
                insertionsortexe();
                break;
            case 3:
                selectionsortexe();
                break;
            case 4:
                quicksortexe();
                break;
            case 5:
                System.err.println("Saindo...");
                break;

        }
    }

    public static void main(String[] args) {
        start();

    }

}
