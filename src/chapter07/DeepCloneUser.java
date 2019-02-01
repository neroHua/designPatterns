package chapter07;

public class DeepCloneUser implements Cloneable {

    int id;
    String name;
    
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 偷赖未克隆：name
        return super.clone();
    }
    
}
