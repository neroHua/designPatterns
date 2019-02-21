package chapter20;

import java.util.List;

public interface MarriageMediator {

    public void setHumanList(List<Human> humanList); 

    public abstract Human findMarriage();

    public abstract Human findMarriage(int heart);

}