package SortingAlgorithms_Activity;

import java.util.Arrays;


public class SortingAlgorithms {

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

        }

    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(String label, int[] arr) {
        System.out.print(label);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int originalarray[] = {20, 30, 40, 50, 10, 60, 80, 70, 100, 90};

       int[] bubbleCopy = Arrays.copyOf(originalarray, originalarray.length);
        int[] selectionCopy = Arrays.copyOf(originalarray, originalarray.length);
        int[] insertionCopy = Arrays.copyOf(originalarray, originalarray.length);

        printArray("Original Array:                 ", originalarray);

        bubbleSort(bubbleCopy);
        printArray("Sorted Array (Bubble Sort):     ", bubbleCopy);

        selectionSort(selectionCopy);
        printArray("Sorted Array (Selection Sort):  ", selectionCopy);

        insertionSort(insertionCopy);
        printArray("Sorted Array (Insertion Sort):  ", insertionCopy);
    }
}