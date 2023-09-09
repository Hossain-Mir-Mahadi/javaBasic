package basic_code;

import java.util.Scanner;

public class condition_from_user_test {
    public static void main(String[] args) {
        System.out.println("Please enter students marks :");
        Scanner scanner = new Scanner(System.in);
        double marks = scanner.nextDouble();

        if(marks >= 94){
            System.out.println("Got A+");
        }
        else if(marks>=90 && marks<=93.5){
            System.out.println("Got A");
        }
        else if(marks>=86 && marks<=89.5){
            System.out.println("Got A-");
        }
        else if(marks>=80 && marks<=85.5){
            System.out.println("Got B+");
        }
        else if(marks>=75 && marks<=79.5){
            System.out.println("Got B");
        }
        else if(marks>=70 && marks<=74.5){
            System.out.println("Got B-");
        }
        else if(marks>=65 && marks<=69.5){
            System.out.println("Got C");
        }
        else if(marks>=60 && marks<=64.5){
            System.out.println("Got C+");
        }
        else if(marks>=55 && marks<=59.5){
            System.out.println("Got C-");
        }
        else if(marks>=50 && marks<=54.5){
            System.out.println("Got D");
        }
        else{
            System.out.println("Failed");
        }
    scanner.close();
    }//main class
}//public class
