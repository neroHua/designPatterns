package chapter13;

public class SystemFacade1 implements SystemFacade {

    SystemA systemA;
    SystemB systemB;
    SystemC systemC; 
    
    public SystemFacade1(SystemA systemA, SystemB systemB, SystemC systemC) {
        this.systemA = systemA;
        this.systemB = systemB;
        this.systemC = systemC;
    } 

    @Override
    public void job() {
        systemA.start();
        systemB.start();
        systemC.start();
        systemC.job();
        systemA.shutdown();
        systemB.shutdown();
        systemC.shutdown();
    }

}
