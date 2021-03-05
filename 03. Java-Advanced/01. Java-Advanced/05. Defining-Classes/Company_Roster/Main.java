package Company_Roster;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Department> departments = new HashMap<>();

        int entries = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < entries; i++) {
            String[] data = scanner.nextLine().split("\\s+");

            Employee employee;

            if (data.length == 4) {
                employee = new Employee(data[0], Double.parseDouble(data[1]), data[2], data[3]);
            } else if (data.length == 5) {
                try {
                    employee = new Employee(data[0], Double.parseDouble(data[1]), data[2], data[3], Integer.parseInt(data[4]));
                } catch (Exception e) {
                    employee = new Employee(data[0], Double.parseDouble(data[1]), data[2], data[3], data[4]);
                }
            } else {
                employee = new Employee(data[0], Double.parseDouble(data[1]), data[2], data[3],
                        data[4], Integer.parseInt(data[5]));
            }

            if (!departments.containsKey(data[3])) {
                departments.put(data[3], new Department(data[3]));
            }

            departments.get(data[3]).addEmployee(employee);
        }

        Department highestPaidDep = new Department("Temp");
        double highestAverageSalary = 0f;

        for (Map.Entry<String, Department> department : departments.entrySet()) {
            double currentAverageSalary = department.getValue().getAverageSalary();
            if (currentAverageSalary > highestAverageSalary) {
                highestAverageSalary = currentAverageSalary;
                highestPaidDep = department.getValue();
            }
        }

        System.out.printf("Highest Average Salary: %s\n", highestPaidDep.getDepartmentName());
        highestPaidDep.listEmployees();
    }
}
