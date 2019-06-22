package app;

import java.util.Random;

public class App {

    public static void main(String[] args) throws Exception {
        int n = 10000000;
        int[] arr = generateRandomArray(n);
    
        Sort sort1 = new QuickSort();
        Sort sort2 = new MergeSort();
        test_sort(sort1, arr);
        test_sort(sort2, arr);
    }

    public static int[] generateRandomArray(int n) {
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n);
        }
        return arr;
    }

    public static int[] generateNearlyArray(int n, int swapTimes) {
        Random random = new Random();
        int[] arr = new int[n];
        int randomIndex_i, randomIndex_j;
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < swapTimes; i++) {
            randomIndex_i = random.nextInt(n);
            randomIndex_j = random.nextInt(n);
            swap(arr, randomIndex_i, randomIndex_j);
        }
        return arr;
    }

    private static void test_sort(Sort sort, int[] arr) {
        long startTime = System.nanoTime();
        sort.sort(arr);
        long endTime = System.nanoTime();
        if (isSorted(arr)) {
            System.out.println("sort used time:" + (endTime - startTime)/1000000000.0 + "s" );
        } else {
            System.out.println("sort failured!");
        }
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;  
    }
}