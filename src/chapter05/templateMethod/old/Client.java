package chapter05.templateMethod.old;

/**
 * 
 * 模板模式(template)
 * 当有步骤比较多，且部分固定时，可以使用
 * 
 * @author 滑德友
 * @time  2019年2月22日14:13:37
 *
 */
public class Client {

    public static void main(String[] args) {
        GameTemplate basketBallGame = new BasketBallGame();
        basketBallGame.play();
    }

}
