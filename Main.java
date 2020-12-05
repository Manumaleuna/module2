package com.company;
import java.util.Arrays;


public class Main {

    static int findElement(int[][] a, int n, int key) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
            if (a[i][j] == key)
                return i;

        return -1;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 4, 5, 4, 8, 5}, {4, 5, 5, 9, 10, 6}, {7, 2, 3, 5},};
        try {
        for (int[] value : a) {
            for (int i : value) {
                System.out.println(i + " ");
            }
            System.out.println();
        }


        int position = findElement(a, 2, 5);

        if (position == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element Found at Position: "
                    + (position + 1));

        int[][] b;
        b = a;

        for (int i = 0; i < b.length; i++)
            for (int j = 0; j < b.length; j++)
                System.out.println(b[i][j]);

        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);

        int[] c = {5, 20, 13, 17, 24, 6, 100};
        System.out.println("Unsorted array" + Arrays.toString(c));
        Arrays.sort(c);
        System.out.println("New sorted Array" + Arrays.toString(c));

    }
    catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Exeption has been caught");
    }

    }
}

