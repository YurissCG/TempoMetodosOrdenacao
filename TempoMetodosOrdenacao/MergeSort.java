public class MergeSort {
    public static void mergeSort(double[] array) {
        if (array == null) {
            return;
        }
        if (array.length > 1) {
            double[] left = leftHalf(array);
            double[] right = rightHalf(array);
            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
    }

    public static double[] leftHalf(double[] array) {
        int size1 = array.length / 2;
        double[] left = new double[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }

    public static double[] rightHalf(double[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        double[] right = new double[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }

    public static void merge(double[] result, double[] left, double[] right) {
        int i1 = 0; // Índice para a parte esquerda
        int i2 = 0; // Índice para a parte direita
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
    }
}
