package chapter04.facade;

public class SystemFacadeImpl implements SystemFacade {

    SystemA systemA = new SystemAImpl();
    SystemB systemB = new SystemBImpl();
    SystemC systemC = new SystemCImpl();
    
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
