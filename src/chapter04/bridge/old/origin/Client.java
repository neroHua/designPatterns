package chapter04.bridge.old.origin;

/**
 * 
 * 原始用法
 * 
 * @author 滑德友 
 * @time 2019年2月11日10:01:59
 *
 */
public class Client {

    public static void main(String[] args) {
        BlueCircle blueCircle = new BlueCircle();
        BlueRectangle blueRectangle = new BlueRectangle();
        RedCircle redCircle = new RedCircle();
        RedRectangle rectangle = new RedRectangle();
        
        blueCircle.show();
        blueRectangle.show();
        redCircle.show();
        rectangle.show();
    }

}
