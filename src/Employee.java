import java.util.Objects;

public class Employee {
    private final String fullName;
    private int departament;
    private int salary;
    private final int  id;
public static int count = 1;
    public Employee(String fullName, int departament, int salary) {
        this.fullName = fullName;
        this.departament = departament;
        this.salary = salary;
        this.id = count++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartament() {
        return departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public int getSalary() {
        return salary;

    }
    @Override
    public String toString() {
        return "id=" + id + ", " + "ФИО: "+ fullName + ", Отдел: " + departament + ", Заработная плата: " + salary ;
    }

public void setSalary(int salary){
        this.salary = salary;
}
    public int getId() {
        return this.id;
    }
    @Override
    public boolean equals(Object object) {
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Employee other = (Employee) object ;
        return fullName.equals(other.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(fullName);
    }
}
