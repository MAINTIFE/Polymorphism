package Company;

import java.math.BigInteger;
import java.util.Scanner;

class HR extends Department {
    String phoneNumber;
    String Name;
    String Gender;

    public void getDetail(){
        super.getDetail();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the HR's phone number: ");
        phoneNumber = input.nextLine();
        System.out.println("Enter the HR's Name: ");
        Name = input.nextLine();
        System.out.println("Enter the HR's Gender: ");
        Gender = input.nextLine();
        showDetail();
    }

    public void showDetail(){
        System.out.println("The details entered are: ");
        System.out.println("Department ID: " + super.departmentID);
        System.out.println("Department Name: " + super.departmentName);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Name: " + Name);
        System.out.println("Gender: " + Gender);
    }
}
