package OOP_basic;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhan ten: ");
        String name = scanner.nextLine();
        System.out.print("Nhan lop: ");
        String classes = scanner.nextLine();
        System.out.print("Nhan diem mon C: ");
        float c = scanner.nextFloat();
        System.out.print("Nhan diem mon PHP: ");
        float php = scanner.nextFloat();
        float avg = (c + php)/2;
        if (avg >= 8){
            System.out.print("Gioi");
        }else if (avg >= 6){
            System.out.print("Gioi");
        }else if (avg >= 5){
            System.out.print("TB");
        }else{
            System.out.print("Khong dat");
        }

    }
}
