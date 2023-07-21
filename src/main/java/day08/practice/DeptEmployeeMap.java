package day08.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DeptEmployeeMap {
	public static void main(String[] args) {
        String input = "HR Ram, HR Suresh ,IT Basker ,IT Joseph, Admin Sundar";

        // Split the input by commas and trim any extra spaces
        String[] deptEmpPairs = input.split("\\s*,\\s*");
        

        // Use a HashMap to store the mapping of DeptName to a list of Employees
        HashMap<String, List<String>> deptEmployeeMap = new HashMap<>();
        for (String pair : deptEmpPairs) {
            String[] parts = pair.split("\\s+");
         
            String deptName = parts[0].trim();
            String employeeName = parts[1].trim();

            // Add the employee to the list associated with the department
          //  if (!deptEmployeeMap.containsKey(deptName)) {
                deptEmployeeMap.putIfAbsent(deptName, new ArrayList<>());
           // }
            deptEmployeeMap.get(deptName).add(employeeName);
        }

        // Print the DeptName and list of Employees
        for (Map.Entry<String, List<String>> entry : deptEmployeeMap.entrySet()) {
            String deptName = entry.getKey();
            List<String> employees = entry.getValue();

            System.out.println(deptName + ": " + String.join(", ", employees));
        }
    }
}
