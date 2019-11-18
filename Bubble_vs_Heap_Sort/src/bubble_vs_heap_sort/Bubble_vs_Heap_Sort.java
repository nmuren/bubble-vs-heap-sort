package bubble_vs_heap_sort;

import java.util.Scanner;

public class Bubble_vs_Heap_Sort {

    static void bubbleSort(int[] a) {
        int[] clone = a.clone();
        int swaps = 0;

        for (int i = 0; i < clone.length; i++) {
            for (int j = 0; j < clone.length - 1; j++) {
                if (clone[j] > clone[j + 1]) {
                    int temp = clone[j];
                    clone[j] = clone[j + 1];
                    clone[j + 1] = temp;
                    swaps++;
                }
            }
        }

        System.out.println(
                "Array is sorted in " + swaps + " swaps with Bubble Sort.");

        for (int i = 0; i < clone.length; i++) {
            System.out.print(clone[i] + " ");
        }
    }

    static void heapSort(int[] a) {
        int[] clone = a.clone();
        int n = clone.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heaper(clone, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = clone[0];
            clone[0] = clone[i];
            clone[i] = temp;

            heaper(clone, i, 0);
        }
        for (int i = 0; i < clone.length; i++) {
            System.out.print(clone[i] + " ");
        }
    }

    static void heaper(int[] clone, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && clone[l] > clone[largest]) {
            largest = l;
        }
        if (r < n && clone[r] > clone[largest]) {
            largest = r;
        }
        if (largest != i) {
            int swap = clone[i];
            clone[i] = clone[largest];
            clone[largest] = swap;

            heaper(clone, n, largest);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        bubbleSort(a);
        System.out.println("");
        heapSort(a);
    }

}
