
import java.util.ArrayList;
import java.util.List;

    public class Main {
        private List<Employee> employees;

        public Main() {
            employees = new ArrayList<>();
        }

        public void addEmployee(Employee employee) {
            employees.add(employee);
        }

        public List<Employee> findEmployeesByExperience(int experience) {
            List<Employee> result = new ArrayList<>();
            for (Employee employee : employees) {
                if (employee.getExperience() == experience) {
                    result.add(employee);
                }
            }
            return result;
        }

        public List<String> findPhoneNumbersByName(String name) {
            List<String> result = new ArrayList<>();
            for (Employee employee : employees) {
                if (employee.getName().equals(name)) {
                    result.add(employee.getPhoneNumber());
                }
            }
            return result;
        }

        public Employee findEmployeeByEmployeeId(int employeeId) {
            for (Employee employee : employees) {
                if (employee.getEmployeeId() == employeeId) {
                    return employee;
                }
            }
            return null;
        }

        public static void main(String[] args) {
            Main directory = new Main();

            // Adding employees to the directory
            directory.addEmployee(new Employee(1, "John Doe", "1234567890", 5));
            directory.addEmployee(new Employee(2, "Jane Smith", "9876543210", 3));
            directory.addEmployee(new Employee(3, "Mike Johnson", "4567890123", 7));

            // Searching employees by experience
            List<Employee> employeesByExperience = directory.findEmployeesByExperience(5);
            System.out.println("Employees with experience 5:");
            for (Employee employee : employeesByExperience) {
                System.out.println(employee);
            }

            // Searching phone numbers by name
            List<String> phoneNumbers = directory.findPhoneNumbersByName("Jane Smith");
            System.out.println("Phone numbers of employees with name 'Jane Smith':");
            for (String phoneNumber : phoneNumbers) {
                System.out.println(phoneNumber);
            }

            // Searching employee by employee ID
            Employee employee = directory.findEmployeeByEmployeeId(3);
            if (employee != null) {
                System.out.println("Employee with employee ID 3: " + employee);
            } else {
                System.out.println("Employee with employee ID 3 not found");
            }
        }
    }

