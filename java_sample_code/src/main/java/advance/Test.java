package advance;

import static advance.MonthMethodOverloading.getMonthMethodOverloading;

public class Test {
    public static void main(String[] args) {
        //Rectangle rectangle=new Rectangle(); //object creation: class er nam (Rectangle), object er nam(rectangle),new keyword,oy class er constructor(Rectangle)

        Rectangle rectangle1 = new Rectangle(5, 10);//Using custom constructor.
        double area1 = rectangle1.calculateRectangleArea();// calculate area
        System.out.println("rectangle area:" + area1);

        double parameter = rectangle1.calculateRectangleParameter();//// calculate parameter
        System.out.println("calculate parameter:" + parameter);

        System.out.println("***************" );

        Rectangle rectangle2=new Rectangle();// using getter & setter method with default constructor.
        rectangle2.setLength(2);
        rectangle2.setWidth(4);
        double area2 = rectangle2.calculateRectangleArea();
        System.out.println("rectangle area:" + area2);
        System.out.println("calculate parameter:" + parameter);

        //getTotalArea(area1,area2);//static er vitore non static k jayga dite parbo na.
        //create korte hole object create kore thn default constructor k dakte hobe
       // Test test =new Test();
        //test.getTotalArea(area1,area2);
        getTotalArea(area1,area2);


        System.out.println(getMonthMethodOverloading(5));// from getMonthMethodOverloading Class.
        System.out.println(getMonthMethodOverloading("May"));// from getMonthMethodOverloading Class.
        System.out.println(getMonthMethodOverloading(5) +" is match with the month " + getMonthMethodOverloading("May"));
    }
    public static double getTotalArea(double rectangle1,double rectangle2){
        return rectangle1+rectangle2;
    }
}
