package services.impl;

import Models.Employee;
import services.EmployeeService;

import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {
    public  static Map<String,Employee> employeeMap;
    static {
        employeeMap=new HashMap<>();
        employeeMap.put("001", new Employee("001","Nguyen Hong Son",20,"Da Nang"));
        employeeMap.put("002", new Employee("002","Nguyen Hong Son",20,"Da Nang"));
        employeeMap.put("003", new Employee("003","Nguyen Hong Son",20,"Da Nang"));
        employeeMap.put("004", new Employee("004","Nguyen Hong Son",20,"Da Nang"));
        employeeMap.put("005", new Employee("005","Nguyen Hong Son",20,"Da Nang"));
        employeeMap.put("006", new Employee("006","Nguyen Hong Son",20,"Da Nang"));
        employeeMap.put("007", new Employee("007","Nguyen Hong Son",20,"Da Nang"));
        employeeMap.put("008", new Employee("008","Nguyen Hong Son",20,"Da Nang"));
        employeeMap.put("009", new Employee("009","Nguyen Hong Son",20,"Da Nang"));
        employeeMap.put("010", new Employee("010","Nguyen Hong Son",20,"Da Nang"));
    }

    @Override
    public void showInfoEmployee() {
        Set<String> set = employeeMap.keySet();
        for (String key : set) {
            System.out.println(key + " " + employeeMap.get(key).getNameEmployee());
        }
    }
}