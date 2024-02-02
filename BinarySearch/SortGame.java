package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortGame {
	static class Employee {
        String name;
        int salary;

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    static class SalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            if (e1.salary == e2.salary) {
                return e1.name.compareTo(e2.name);
            }
            return Integer.compare(e2.salary, e1.salary);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int n = scanner.nextInt();

        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int salary = scanner.nextInt();
            if (salary >= x) {
                employees.add(new Employee(name, salary));
            }
        }

        Collections.sort(employees, new SalaryComparator());

        for (Employee employee : employees) {
            System.out.println(employee.name + " " + employee.salary);
        }
    }
}
