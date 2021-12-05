package chapter05.visitor.old;

public interface Department {
    
    public void visit(EmployeeFull employeeFull);

    public void visit(EmployeeTemp employeeTemp);
    
}