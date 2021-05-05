package OOP_Class.bai2;

import java.util.Scanner;

public class Student {
    String name, classes;
    float c, php;
    public void Input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhan ten: ");
        this.name = scanner.nextLine();
        System.out.print("Nhan lop: ");
        this.classes = scanner.nextLine();
        System.out.print("Nhan diem mon C: ");
        this.c = scanner.nextFloat();
        System.out.print("Nhan diem mon PHP: ");
        this.php = scanner.nextFloat();
    }
    public void XepLoai(){
        float avg = (this.c + this.php)/2;
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
