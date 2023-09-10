package loop;

import javaCode.calculator;

import java.util.Scanner;

import static javaCode.calculator.*;

public class EmployeeSalaryUsingMethod extends calculator {
    public static void main(String[] args) {
        int hourRange=30;
        double payableRate =15;
        double salary;
        int payBonus=5;

        Scanner scanner =new Scanner(System.in);
        System.out.println("do you want to run: yes/no");//ask for permission

        String controller= scanner.next();//give permission using controller
        while (controller.equalsIgnoreCase("yes")){
            System.out.println("please enter employee hourRange:");

            int weeklyHRange=scanner.nextInt();

            if(weeklyHRange>hourRange){
                salary=(weeklyHRange*payableRate)+payBonus;
                System.out.println("Congratulations you got bonus $5.");
                System.out.println("Total Salary= $"+salary);
            }
            else if (weeklyHRange<hourRange) {
                salary=weeklyHRange*payableRate;
                System.out.println("you won't get bonus $5.");
                System.out.println("Total Salary= $"+salary);
            } else if (weeklyHRange == hourRange) {
                salary=weeklyHRange*payableRate;
                System.out.println("Total Salary= $"+salary);
                System.out.println("You should do better in next time");
            }

            else {
                System.out.println("You are not eligible for the bonus.");
            }

        }
        scanner.close();
        //calculateSum( a:2 ,b:4);
        calculateSub(2,6);
        //calculateMul(a ,b);
        calculateDiv(2,6);



    }
}
