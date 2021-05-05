package OOP_basic;

import java.util.*;

public class concat {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int arr3_length = arr1.length + arr2.length;

        int[] arr3 = new int[arr3_length];
        System.out.println(arr3.length);
        for (int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for (int j = arr1.length; j < arr3_length; j++){
            arr3[j] = arr2[j - arr1.length];
        }

        System.out.println(Arrays.toString(arr3));
    }
}
