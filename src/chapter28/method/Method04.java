package chapter28.method;

import chapter28.bean.BookEnglish;
import chapter28.bean.Boy;

public class Method04 {
    
    public <T> T getSomething(Class<T> t) throws InstantiationException, IllegalAccessException {
        return t.newInstance();
    }
    
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Method04 method01 = new Method04();

        BookEnglish bookEnglish = method01.getSomething(BookEnglish.class);
        System.out.println(bookEnglish.getType());

        Boy boy = method01.getSomething(Boy.class);
        System.out.println(boy.getSex());
    }

}
