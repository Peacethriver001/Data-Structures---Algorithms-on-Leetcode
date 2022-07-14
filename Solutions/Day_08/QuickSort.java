public class QuickSort {
    public static void main (String [] args){
        int [] array = {-2, -1, 3, -3, 1, 2, 0};
        int n = array.length;

        quickSort(array, 0, n - 1);
        printArray(array, n);
    }

    public static void printArray(int [] A, int size){
        for (int i = 0; i < size - 1; i++){
            System.out.println(A[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int [] array, int left, int right){
        if (left < right){
            int pi = partition(array, left, right);

            quickSort(array, left, pi - 1);
            quickSort(array, pi + 1, right);
        }
    }

    public static int partition(int [] A, int left, int right){
        right = A.length - 1;
        left = 0;
        int i = left - 1;
        int pivot = A[right];
        for (int j = left; j < right - 1; j++){
            if (A[j] < pivot){
                i++;
                //Swap A[i] and A[j];
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;
            }
        }
        //Swap pivot and A[i+1];
        int help = pivot;
        pivot = A[i + 1];
        A[i + 1] = help;

        return (i + 1);
    }
}
