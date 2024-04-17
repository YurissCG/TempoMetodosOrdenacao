import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Quantas posições tem o vetor?");
        int n = teclado.nextInt();

        //choose the shape in which the vector will be Increasing, Descending, random. Remove the two bars on the left to work
            double[] vetor = GerarVetor.geraVetorAleatorio(n, rand);
            //double[] vetor = GerarVetor.geraVetorDecrescente(n);
            //double[] vetor = GerarVetor.geraVetorOrdenado(n);

        long startTime = System.nanoTime();
        // the function time starts here, just remove the two sidebars to make the function work and look at the time it took to sort

            BubbleSort.bubbleSort(vetor);
            //SelectionSort.selectionSort(vetor);
            //InsertSort.insertionSort(vetor);
            //MergeSort.mergeSort(vetor);
            //QuickSort.quickSort(vetor, 0, vetor.length - 1);
            //ShellSort.shellSort(vetor);
            //HeapSort.heapSort(vetor);

        long endTime = System.nanoTime();
        // time over here

        long elapsedTimeInMillis = (endTime - startTime) / 1_000_000;
        System.out.println("Tempo decorrido: " + elapsedTimeInMillis + " milissegundos");
    }
}
