package chapter07;

public class DeepClone implements Cloneable {
    
    int id;
    String name;
    
    DeepCloneUser user;

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
    public DeepCloneUser getUser() {
        return user;
    }
    public void setUser(DeepCloneUser user) {
        this.user = user;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepClone deepCloned= (DeepClone)super.clone();
        // 偷赖未克隆：name
        // 克隆引用类型:user
        DeepCloneUser deepCloneUser = deepCloned.getUser();
        DeepCloneUser deepClonedUser = (DeepCloneUser)deepCloneUser.clone();
        deepCloned.setUser(deepClonedUser);
        
        return deepCloned;
    }
    
}
