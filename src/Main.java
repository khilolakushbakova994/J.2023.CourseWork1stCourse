public class Main {

    public static Employee[] employees = new Employee[10];

    public static void listAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employees);
        }
    }

    public static int calculateSumOfSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;

    }

    public static Employee findMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                result = employee;
            }


        }
        return result;


    }

    public static Employee findMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;


    }

    public static float calculateAverageSalary() {
        return calculateSumOfSalary() / employees.length;
    }

    public static void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public static void main(String[] args) {
        employees = new Employee[]{
                new Employee("Tom Hanks", 1, 150000),
                new Employee("Audrey Tautou", 2, 150000),
                new Employee("Jean Reno", 3, 120000),
                new Employee("Paul Bettany", 4, 100000),
                new Employee("Ian McKellen", 3, 100000),
                new Employee("Alfred Molina", 6, 100000)
        };
    }
}


