package chapter05.mediator.old;

public class Man extends Human {
    
    public Man(MarriageMediator marriageMediator, int heart) {
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
