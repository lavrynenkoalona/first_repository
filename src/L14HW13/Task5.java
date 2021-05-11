package L14HW13;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    // Create HashMap with 3 user defined objects Employee (id, name, city).
    // Employee is separate class with described fields and overriden toString(), equals() and hashcode() methods.
    // Compare these 3 objects of Employee as values of maps (they need to have different keys)
    public static void main(String[] args) {
        Map<Integer, Employee> employeesMap = new HashMap<>();

        employeesMap.put(1001, new Employee(1, "Ivan", "Moscow"));
        employeesMap.put(1002, new Employee(2, "David", "New York"));
        employeesMap.put(1003, new Employee(3, "Josef", "Berlin"));

        System.out.println(employeesMap);

        for (Employee employee1: employeesMap.values())
        {
            for (Employee employee2: employeesMap.values())
            {
                System.out.println(String.format("employee1=%s, employee2=%s, equlas=%s",
                        employee1, employee2, employee1.equals(employee2)));
            }
        }

    }
    
}
