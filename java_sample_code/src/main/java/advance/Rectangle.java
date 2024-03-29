package advance;

public class Rectangle {
   private double length;
   private double width;

   public Rectangle(){   //constructor criteria- 1 access modifier,no return type,class er na er sathe mil thakbe
       this.length = 0;
       this.width = 0;
   }
   public Rectangle(double length, double width){
       this.length = length;
       setWidth(width);

   }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

   public double calculateRectangleParameter(){
        return (2*length)+(2*width);
    }
    public double calculateRectangleArea(){
        return length*width;
    }
}
