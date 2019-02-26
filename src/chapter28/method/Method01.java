package chapter28.method;

import chapter28.bean.BookEnglish;
import chapter28.bean.Boy;

public class Method01 {
    
    public <T> T getSomething(T t) {
        return t;
    }
    
    public static void main(String[] args) {
        Method01 method01 = new Method01();

        BookEnglish bookEnglish = method01.getSomething(new BookEnglish());
        System.out.println(bookEnglish.getType());

        Boy boy = method01.getSomething(new Boy());
        System.out.println(boy.getSex());
    }

}
