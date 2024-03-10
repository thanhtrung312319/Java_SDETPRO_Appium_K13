package Java_Lab.Java_Lab10_2;

import Java_Lab.Java_Lab10_2.Contract;
import Java_Lab.Java_Lab10_2.FTE;
import Java_Lab.Java_Lab10_2.Employee;

import java.util.Arrays;
import java.util.List;


    public class SalaryController {
            public static void main(String[] args) {
                Employee fte = new FTE();
                Employee contractor = new Contract();
                int total = SalaryController.getTotalSalary(Arrays.asList(fte,contractor));
                System.out.println(total);
            }

        public static int getTotalSalary(List<Employee> employeeList) {
            int totalSalary = 0;
            for (Employee employee : employeeList) {
                totalSalary = totalSalary + employee.getSalary() + employee.getSupportSalary();
            }
            return totalSalary;
        }
    }
