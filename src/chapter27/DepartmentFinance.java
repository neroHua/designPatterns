package chapter27;

public class DepartmentFinance implements Department {

    @Override
    public void visit(EmployeeFull employeeFull) {
        employeeFull.money += 2;
        System.out.println("全职员工 + 2元");
    }

    @Override
    public void visit(EmployeeTemp employeeTemp) {
        employeeTemp.money += 1;
        System.out.println("零时员工 + 1元");
    }

}
