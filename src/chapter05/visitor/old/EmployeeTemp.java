package chapter05.visitor.old;

public class EmployeeTemp implements Employee {

    int worktime;
    int money;

    @Override
    public void accpet(Department department) {
        department.visit(this);
    }

}
