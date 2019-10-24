package ru.company.test.handh;

public class HandH {

    public static int max = 0;
    public static int[] array = {3, 7, 12, 28, 8};

    public static void main(String[] args) {
        findMax(array);
    }

    public static int findMax(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }
        return max;
    }
}


