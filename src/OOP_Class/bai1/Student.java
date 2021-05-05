package OOP_Class.bai1;

public class Student {
    String firstName;
    String lastName;
    int age;
    public Student(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public void Hello(){
        System.out.print("Hello " + this.firstName + " " + this.lastName + " " + this.age + " tuoi");
    }
}
