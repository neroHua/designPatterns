package otherPattern.nullObject;

public class UserNull implements User {
    
    String name;

    @Override
    public boolean nullObject() {
        return true;
    }

    @Override
    public String getName() {
        System.out.println("空对象不支持任何操作!");
        return null;
    }

    @Override
    public void setName(String name) {
        System.out.println("空对象不支持任何操作!");
    }

}
