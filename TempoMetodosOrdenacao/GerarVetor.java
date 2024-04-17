import java.util.Random;

public class GerarVetor {
    public static double[] geraVetorOrdenado(int n) {
        double[] vetor = new double[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = i + 1;
        }
        return vetor;
    }


    public static double[] geraVetorDecrescente(int n) {
        double[] vetor = new double[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = n - i;
        }
        return vetor;
    }

    public static double[] geraVetorAleatorio(int n, Random rand) {
        double[] vetor = new double[n];
        for (int aux = 0; aux < n; aux++) {
            vetor[aux] = rand.nextDouble();
        }
        System.out.println("Vetor gerado:");
        for (int i = 0; i < n; i++) {
            System.out.println(vetor[i]);
        }
        return vetor;
    }
}
