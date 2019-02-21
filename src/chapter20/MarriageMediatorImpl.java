package chapter20;

import java.util.List;

public class MarriageMediatorImpl implements MarriageMediator {
    
    private List<Human> humanList;
    
    @Override
    public void setHumanList(List<Human> humanList) {
        this.humanList = humanList;
    }

    @Override
    public Human findMarriage() {
        for (Human human : humanList) {
            if (null != human) {
                return human;
            }
        }
        
        return null;
    }

    @Override
    public Human findMarriage(int heart) {
        for (Human human : humanList) {
            if (heart == human.heart) {
                return human;
            }
        }
        
        return null;
    }

}
