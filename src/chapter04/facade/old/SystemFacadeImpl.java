package chapter04.facade.old;

public class SystemFacadeImpl implements SystemFacade {

    SystemA systemA;
    SystemB systemB;
    SystemC systemC; 
    
    public SystemFacadeImpl(SystemA systemA, SystemB systemB, SystemC systemC) {
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
