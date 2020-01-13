package Staff.Manegement;

public class Director extends Manager {

    double budget;

    public Director(String name, String ni, double salary, String dept, double budget) {
        super(name, ni, salary, dept);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
