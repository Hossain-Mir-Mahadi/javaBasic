package variable;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        //employee hour
        System.out.println("employee hour:");
        Scanner scanner = new Scanner(System.in);
        double hour = scanner.nextDouble();

        //rate
        System.out.println("employee rate:");
        double rate = scanner.nextDouble();
        // employee pay
        double payable = hour*rate;
        //display
        System.out.println("Employee salary:"+ payable);
    }
}
