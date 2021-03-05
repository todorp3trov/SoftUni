package Company_Roster;

import java.util.ArrayList;
import java.util.List;

class Department {
    private String departmentName;
    private List<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void listEmployees() {
        employees.stream()
                .sorted((f, s) -> (int) (s.getSalary() - f.getSalary()))
                .forEach(e -> System.out.println(e.toString()));
    }

    public double getAverageSalary() {
        double averageSalary = 0f;

        for (Employee employee : employees) {
            averageSalary += employee.getSalary();
        }

        return averageSalary / employees.size();
    }
}
