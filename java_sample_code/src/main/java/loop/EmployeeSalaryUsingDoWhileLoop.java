package loop;

import java.util.Scanner;

public class EmployeeSalaryUsingDoWhileLoop {
    public static void main(String[] args) {
        int hourRange=30;
        double payableRate =15;
        double salary;
        int payBonus=5;
        Scanner scanner =new Scanner(System.in);

        String controller;
       do {
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
           System.out.println("do you want to run: yes/no");//ask for permission
           controller= scanner.next();

        }while ((controller.equalsIgnoreCase("yes")));
        scanner.close();

    }
}
