import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {

    private List<Employee> collection;
    
    public EmployeeDirectory() {
        this.collection = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        collection.add(employee);
    }

    public List<Employee> getEmployeeExp(int exp) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : collection) {
            if(employee.getExperience() == exp) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<String> getEmployeePhoneNumber(String phoneNum) {
        List<String> result = new ArrayList<>();
        for (Employee employee : collection) {
            if(employee.getPhoneNumber().equals(phoneNum)) {
                result.add(employee.getName());
                result.add(employee.getPhoneNumber());
            }
        }
        return result;
    }

    public Employee getEmployeeNum(int num) {
        Employee result = null;
        for (Employee employee : collection) {
            if(employee.getNumber() == num) {
                result = employee;
                break;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "EmployeeDirectory{\n" +
                "collection = " + collection +
                "}\n";
    }
}
