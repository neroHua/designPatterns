package chapter24;

public class UserA implements User {
    
    String name;

    @Override
    public boolean nullObject() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
