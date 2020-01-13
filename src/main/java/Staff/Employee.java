package Staff;

public abstract class Employee {
    private String name;
    private String ni;
    private double salary;


    public Employee(String name, String ni, double salary){
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        };
    }

    public String getNi() {
        return ni;
    }

    public void setNi(String ni) {
        this.ni = ni;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double amount){
        if(amount >= 0) {
        setSalary(this.salary+amount);
        };
    }

    public double getBonus(){
        return 0.01*this.salary;
    }
}
