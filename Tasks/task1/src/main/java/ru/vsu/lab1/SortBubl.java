package ru.vsu.lab1;

/**
 * Created by 1 on 28.11.2017.
 */
public abstract class SortBubl implements PersonSorter {

    public static void bubbleSort(Person[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                /*if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }*/
            }
        }
    }
}
