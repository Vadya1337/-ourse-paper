public class Main {
    private final static Employee[] employees = new Employee[10];

    private static void initEmpoyees() {
        employees[0] = new Employee("Некифоров Некита Анатольевич ", 2, 12000);
        employees[1] = new Employee("Серебряков Анатолий Павлович ", 2, 12000);
        employees[2] = new Employee("Прохоров Сергей Петрович ", 3, 16000);
        employees[3] = new Employee("Афонин Андрей Владимирович ", 1, 32000);
        employees[4] = new Employee("Ангаборов Виталий Степановий ", 4, 45000);
        employees[5] = new Employee("Коряков Владимир Ильич ", 5, 50000);
        employees[6] = new Employee("Степанов Федор Евгеньевич ", 3, 40000);
        employees[7] = new Employee("Калужников Эдуард Иванович ", 2, 16000);
        employees[8] = new Employee("Сергеев Пётр Николаевич ", 5, 60000);
        employees[9] = new Employee("Сидоров Арсений Андреевич ", 1, 73000);
    }

    public static void main(String[] args) {
        initEmpoyees();
        print();
        System.out.println("Общая сумма потраченная на заработную плату = " + calculateSalary());
        System.out.println("Сотрудник с минимальной заработной платой: " + minSalary());
        System.out.println("Сотрудник с максимальной заработной платой: " + maxSalary());
        System.out.println("Средняя заработная плата =  " + sredSalary());
        printFullname();
    }

    private static void print() {
        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }

    private static int calculateSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    private static Employee minSalary() {
        Employee employeeMinSalary = null;
        for (Employee employee : employees) {
            if (employeeMinSalary == null || employee.getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }

    private static Employee maxSalary() {
        Employee employeeMaxSalary = null;
        for (Employee employee : employees) {
            if (employeeMaxSalary == null || employee.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    private static double sredSalary() {
        return (double) calculateSalary() / employees.length;
    }

    private static void printFullname() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }

    }
}