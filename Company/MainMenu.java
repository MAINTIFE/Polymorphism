package Company;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner option = new Scanner(System.in);
        System.out.println("Departments");
        System.out.println("1. HR");
        System.out.println("2. Customer Care");
        System.out.println("Enter the option: ");
        int options = option.nextInt();
        switch (options){
            case 1:
                HR hr = new HR();
                hr.getDetail();
                break;
            case 2:
                CustomerCare cc = new CustomerCare();
                cc.getDetail();
                break;
        }
    }
}
