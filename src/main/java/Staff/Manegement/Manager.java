package Staff.Manegement;

import Staff.Employee;

public class Manager extends Employee {
    String dept;

    public Manager(String name, String ni, double salary,String dept) {
        super(name, ni, salary);
        this.dept = dept;
    }

    public String getDept(){
        return this.dept;
    }

}
