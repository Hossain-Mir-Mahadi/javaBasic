package advance;

public class Employee extends Person{
    private String employeeId;
    private String status;

    public Employee(){
        super("Mir");
        System.out.println("Printed from Employee Constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void greetings() {
       // super.greetings();
        System.out.println("Hi " + getName() +"!");
    }
}
