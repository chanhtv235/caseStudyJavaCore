package services.impl;

import Models.Employee;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import services.FileCabinService;

import java.util.Stack;

public class FileCabinServiceImpl implements FileCabinService {
    private static Stack<Employee> employees;

    static {
        employees=new Stack<>();
        employees.push(new Employee("001","Nguyen Hong Son1",20,"Da Nang"));
        employees.push(new Employee("002","Nguyen Hong Son2",20,"Da Nang"));
        employees.push(new Employee("003","Nguyen Hong Son3",20,"Da Nang"));
        employees.push(new Employee("004","Nguyen Hong Son4",20,"Da Nang"));
        employees.push(new Employee("005","Nguyen Hong Son5",20,"Da Nang"));
        employees.push(new Employee("006","Nguyen Hong Son6",20,"Da Nang"));
        employees.push(new Employee("007","Nguyen Hong Son7",20,"Da Nang"));
    }

    @Override
    public Employee findEmployeeById(String id) {
        Stack<Employee> employees1=employees;
        try {
        while (true) {

                Employee employee=employees1.pop();
                if(employee==null) {
                    break;
                }
                if(id.equals(employee.getIdEmployee())) {
                    return employee;
                }
        }
        }catch (Exception e){
            System.out.println("Nhập id bị lỗi nhập");
        }
        return null;
    }

}
