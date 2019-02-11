package chapter09;

public abstract class PartA {
    
    PartB partB;
    String from;
    
    public PartA(PartB partB, String from) {
        this.partB = partB;
        this.from = from;
    }
    
    public void bridgeToPartB() {
        partB.to();
    }
    
    public PartA from() {
        System.out.println("来自" + this.from);
        
        return this;
    }

}
