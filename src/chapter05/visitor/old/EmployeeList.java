package chapter05.visitor.old;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    
    List<Employee> employeeList = new ArrayList<>();

    public void add(Employee employee) {
        employeeList.add(employee);
    }
    
    public void accept(Department department) {
        for (Employee employee : employeeList) {
            employee.accpet(department);
        }
    }

}