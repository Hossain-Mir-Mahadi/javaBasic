package basic_code;

public class For_loop {
    public static void main(String[] args) {
        int i;
        for(i=0; i<=5;i++){
            System.out.println(i);
        }
        System.out.println("**********************************");
        for(i=5;i>=0;i--){
            System.out.println(i);// println theke ln kete dile ak sari te output dekhabe
        }
        System.out.println("**********************************");
        for(i=5;i>=0;i=i-2){
            System.out.println(i);
        }
        System.out.println("**********************************");

        for(i=0; i<=6;i+=2){
                System.out.println(i);
        }
        System.out.println("**********************************");
        for(i=0; i<=6;i+=2){
            if(i!=2 && i!=4){
                System.out.println(i);
            }
        }
    }


}//public class
