package chapter27;

public class EmployeeFull implements Employee {
    
    int worktime;
    int money;

    @Override
    public void accpet(Department department) {
        department.visit(this);
    }

}
