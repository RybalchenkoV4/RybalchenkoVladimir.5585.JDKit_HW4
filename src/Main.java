public class Main {
    public static void main(String[] args) {

        EmployeeDirectory employeeDirectory = new EmployeeDirectory();

        Employee employee0 = new Employee(555,"Vasya", "56124343", 10);
        Employee employee1 = new Employee(234, "Sasha","56454343", 6);
        Employee employee2 = new Employee(523, "Gena","56674343", 45);
        Employee employee3 = new Employee(533, "Gosha","56624343", 45);

        employeeDirectory.addEmployee(employee0);
        employeeDirectory.addEmployee(employee1);
        employeeDirectory.addEmployee(employee2);
        employeeDirectory.addEmployee(employee3);

        System.out.println(employeeDirectory);

        System.out.println(employeeDirectory.getEmployeeExp(45));
        System.out.println(employeeDirectory.getEmployeePhoneNumber("56454343"));
        System.out.println(employeeDirectory.getEmployeeNum(555));
    }
}