package Company;

import java.util.Scanner;
public class Department {
    int departmentID;
    String departmentName;

    public void getDetail(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the department's name: ");
        departmentName = input.nextLine();
        System.out.println("Enter the department's ID: ");
        departmentID = input.nextInt();
    }

}
