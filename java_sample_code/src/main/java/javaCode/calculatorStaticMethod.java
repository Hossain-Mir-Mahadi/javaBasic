package javaCode;

public class calculatorStaticMethod {

    public static void main(String[] args) {
        int sum = calculateSum(10,15);
        System.out.println("total:" +sum);
    }
     static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }


}
