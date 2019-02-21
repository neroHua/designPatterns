package chapter17;

import java.util.List;

public class CommondInvoker {
    
    private List<Commond> commondList;
    
    public CommondInvoker(List<Commond> commondList) {
        this.commondList = commondList;
    }

    public void exceute() {
        for (Commond commond : commondList) {
            commond.execute();
        }
        
        commondList.clear();
    }
}
