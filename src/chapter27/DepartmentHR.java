package chapter27;

public class DepartmentHR implements Department {

    @Override
    public void visit(EmployeeFull employeeFull) {
        employeeFull.worktime  += 2;
        System.out.println("全职员工 + 2小时");
    }

    @Override
    public void visit(EmployeeTemp employeeTemp) {
        employeeTemp.worktime  += 1;
        System.out.println("临时员工 + 1小时");
    }

}
