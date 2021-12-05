package otherPattern.nullObject;

/**
 * 
 * 空对象模式(null object)
 * 一个对象，不支持任何操作，但是不是null
 * 
 * @author 滑德友
 * @time 2019年2月22日13:23:26
 *
 */
public class Client {

    public static void main(String[] args) {
        User userA = new UserA();
        User userNull = new UserNull();
        
        userA.setName("name01");
        userNull.setName("name01");
    }

}
