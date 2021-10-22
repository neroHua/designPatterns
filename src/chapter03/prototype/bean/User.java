package chapter03.prototype.bean;

public class User implements Prototype {

    private int age;

    private String name;

    public User() {
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public User(User user) {
        this.age = age;
        this.name = new String(user.name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() {
        // shallow copy
        return new User(this.age, this.name);
//        deep copy
//        return new User(this);
    }
}
