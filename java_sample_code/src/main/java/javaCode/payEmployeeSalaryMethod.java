package javaCode;

import java.util.Scanner;

import static javaCode.calculator.*;

public class payEmployeeSalaryMethod {
    public static void main(String[] args) {
        int hourRange=30;
        int minHourRange=10;
        double payableRate =15;
        double salary;
        int payBonus=5;

        System.out.println("please enter employee hourRange:");
        Scanner scanner =new Scanner(System.in);
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
        scanner.close();
        calculateMul(6,8);
        calculateDiv(2,6);
        //calculateSum( a ,b);
        calculateSub( 2,6);
    }
}
