package chapter19;


/**
 * 
 * 迭代器模式(iterator)
 * 主要用于访问容器中的元素
 * 
 * @author 滑德友
 * @time 2019年2月21日16:10:36
 *
 */
public class Client {

    public static void main(String[] args) {
        NameContainer nameContainer = new NameContainer(4);
        nameContainer.addName("name01");
        nameContainer.addName("name02");
        nameContainer.addName("name03");
        nameContainer.addName("name04");
        
        Iterator iterator = nameContainer.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
