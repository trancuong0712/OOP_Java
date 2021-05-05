package OOP_basic;

import java.util.*;

public class sort_list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Nhap du lieu cho mang: ");

        for (int i = 0; i < arr.length; i++){
            System.out.println("Nhap so thu " + (i+1));
            arr[i] = scanner.nextInt();
        }

        // sort

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                int temp;
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
