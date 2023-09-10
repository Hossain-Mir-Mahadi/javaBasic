package javaCode;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        System.out.println("input your grade:");
        Scanner scanner = new Scanner(System.in);
        String grade= scanner.next();
        scanner.close();
        String message;

        switch(grade.toUpperCase()){
            case "A" :
                message="great job";
                break;
            case "B" :
                message="good job";
                break;
            case "C" :
                message="Nothing exceptional";
                break;
            case "D" :
                message="Just pass";
                break;
            case "F" :
                message="Failed";
                break;
            default:
                message="Invalid input";
        }
        System.out.println(message);
    }
}
