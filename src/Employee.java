public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private static int idCounter =0;
    private int id;

    public Employee (String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;
    }

    String getFullName () {
        return fullName;
    }
    int getDepartment (){
        return department;
    }
    public void setDepartment(){
        this.department = department;
    }
    int getSalary(){
        return salary;
    }
    public void setSalary () {
        this.salary = salary;

    }
    int getCount (){
        return idCounter;
    }
    int getId (){
        return id;
    }



}
