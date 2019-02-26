package chapter28.method;

import chapter28.bean.Book;
import chapter28.bean.BookEnglish;
import chapter28.bean.Boy;
import chapter28.bean.User;

public class Method03 {
    
    public <T extends Book, K extends User> T getSomething(T t, K k) {
        return t;
    }
    
    public static void main(String[] args) {
        Method03 method01 = new Method03();

        BookEnglish bookEnglish = method01.getSomething(new BookEnglish(), new Boy());
        System.out.println(bookEnglish.getType());

//        Boy boy = method01.getSomething(new Boy());
//        System.out.println(boy.getSex());
    }

}
