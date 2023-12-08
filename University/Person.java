package University;

import java.util.Scanner;

public class Person {
    String firstName;
    String lastName;
    int age;

    public void getDetail(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the basic details");
        System.out.println("Enter the First Name: ");
        firstName = input.nextLine();
        System.out.println("Enter the Last Name: ");
        lastName = input.nextLine();
        System.out.println("Enter the Age: ");
        age = input.nextInt();
    }
}
