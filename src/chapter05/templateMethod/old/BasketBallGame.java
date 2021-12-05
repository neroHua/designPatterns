package chapter05.templateMethod.old;

public class BasketBallGame implements GameTemplate {
    
    public void buyBall() {
       System.out.println("买到篮球");
    }
    
    public void gotoPlayGround() {
        System.out.println("到达操场");
    }
    
    public void goHome() {
        System.out.println("打完回家");
    }

    @Override
    public void play() {
       buyBall(); 
       gotoPlayGround();
       System.out.println("打篮球");
       goHome();
    }

}
