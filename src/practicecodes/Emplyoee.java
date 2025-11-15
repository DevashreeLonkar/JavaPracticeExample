package practicecodes;

public class Emplyoee {

    private String name;
    private Double salary;

    public Emplyoee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }  
}
