package javaCode;

public class calculator {
    private static int calculateSum(int a, int b){
        calculateMul(a ,b);
        int sum= a+b;
        return sum;
    }
    public static int calculateSub(int a, int b){
      calculateSum( a ,b);
        int sub= a+b;
        return sub;
    }
     static int calculateMul(int a, int b){
        calculateSum( a ,b);
        int mul= a+b;
        return mul;
    }
     protected static int calculateDiv(int a, int b){
        calculateSum( a ,b);
        int divi= a+b;
        return divi;
    }
}
