package chapter27;

/**
 * 
 * 访问者模式(visitor)
 * 在不改变原来的类的情况下，增加其他访问方式，增加访问元素类型困难
 * 
 * @author 滑德友
 * @time 2019年2月25日18:24:43
 *
 */
public class Client {

    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        employeeList.add(new EmployeeFull());
        employeeList.add(new EmployeeTemp());
        
        employeeList.accept(new DepartmentHR());
        employeeList.accept(new DepartmentFinance());
    }

}
