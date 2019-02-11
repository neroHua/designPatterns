package chapter09;

public class PartBImp1 implements PartB {
    
    String to;
    
    public PartBImp1(String to) {
        this.to = to;
    }

    @Override
    public void to() {
        System.out.println("到" + this.to);
    }

}
