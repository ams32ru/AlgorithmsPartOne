package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[100_000];
        int[] array2 = new int[100_000];
        int[] array3 = new int[100_000];

        randomGenerationArray(array1);
        randomGenerationArray(array2);
        randomGenerationArray(array3);

        long start1 = System.currentTimeMillis();
        sortBubble(array1);
        System.out.println(System.currentTimeMillis() - start1);
        //результат 22435

        long start2 = System.currentTimeMillis();
        sortSelection(array2);
        System.out.println(System.currentTimeMillis() - start2);
        //результат 10366

        long start3 = System.currentTimeMillis();
        sortInsertion(array3);
        System.out.println(System.currentTimeMillis() - start3);
        //результат 1345

    }

    public static void randomGenerationArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 100);

        }
    }

    private static void swapElements(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }

    public static void sortBubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapElements(arr, j, j + 1);
                }
            }
        }
    }

    public static void sortSelection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swapElements(arr, i, minElementIndex);
        }
    }

    public static void sortInsertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

}