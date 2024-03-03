package Java_Lab.Java_Lab8_1;

import java.util.Arrays;
import java.util.List;

public class EmployeeController {

    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee();
        Employee contrat = new ContractEmployee();

        fullTime.setSalary(50000);
        contrat.setSalary(40000);
    int totalSalary = new EmployeeController().getTotalSalary(Arrays.asList(fullTime, contrat));
        System.out.println(totalSalary);
    }

    public int getTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
    return totalSalary;
    }
}

