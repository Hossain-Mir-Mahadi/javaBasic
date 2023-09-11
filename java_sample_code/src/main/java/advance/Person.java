package advance;

public class Person {
    private  String name;
    private String gender;
    private  int age;

    public Person(){ //constructor 1
        System.out.println("Printed from Person class Constructor");
    }
    public Person(String name){ ////constructor 2
        this.name=name;
        System.out.println("Printed from Person class Constructor " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void greetings(){
        System.out.println("Hello " + name + " !");
    }

}
