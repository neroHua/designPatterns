package chapter05.mediator.old;

public class WoMan extends Human {
    
    public WoMan(MarriageMediator marriageMediator, int heart) {
        super(marriageMediator, heart);
        this.heart = heart;
        this.marriageMediator = marriageMediator;
    }

    @Override
    public Human findMarriage() {
        return marriageMediator.findMarriage();
    }

    @Override
    public Human findMarriage(int heart) {
        return marriageMediator.findMarriage(heart);
    }

}
