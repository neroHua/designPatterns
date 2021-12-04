package chapter05.mediator.old;

public abstract class Human {
    
    protected MarriageMediator marriageMediator;
    protected int heart;
    
    public Human(MarriageMediator marriageMediator, int heart) {
        this.marriageMediator = marriageMediator;
    }
    
    public abstract Human findMarriage();

    public abstract Human findMarriage(int heart);

}
