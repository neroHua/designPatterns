package chapter28.method;

import chapter28.bean.Book;
import chapter28.bean.BookEnglish;

public class Method02 {
    
    public <T extends Book> T getSomething(T t) {
        return t;
    }
    
    public static void main(String[] args) {
        Method02 method01 = new Method02();

        BookEnglish bookEnglish = method01.getSomething(new BookEnglish());
        System.out.println(bookEnglish.getType());

//        Boy boy = method01.getSomething(new Boy());
//        System.out.println(boy.getSex());
    }

}
