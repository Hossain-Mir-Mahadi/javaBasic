package basic_code;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
       // int dayValue =4;
        System.out.println("please enter a number:");
        Scanner scanner = new Scanner(System.in);
        //int dayValue = scanner.nextInt();

        while(scanner.hasNext()){
            int dayValue = scanner.nextInt();

        switch(dayValue){
            case 1 :
                System.out.println("Sat");
                break;
            case 2 :
                System.out.println("SUN");
                break;
            case 3 :
                System.out.println("Mon");
                break;
            case 4 :
                System.out.println("tues");
                break;
            case 5 :
                System.out.println("wed");
                break;
            case 6 :
                System.out.println("thurs");
                break;
            case 7 :
                System.out.println("Fri");
                break;
            default:
                System.out.println("invalid input");
        }
        }
        scanner.close();
    }//main class
}//public class
