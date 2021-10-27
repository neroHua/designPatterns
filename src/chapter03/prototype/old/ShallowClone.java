package chapter03.prototype.old;

public class ShallowClone implements Cloneable {
    
    int id;
    String name;
    
    ShallowCloneUser user;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ShallowCloneUser getUser() {
        return user;
    }
    public void setUser(ShallowCloneUser user) {
        this.user = user;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
}
