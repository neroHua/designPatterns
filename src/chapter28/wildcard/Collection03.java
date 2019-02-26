package chapter28.wildcard;

import chapter28.bean.Boy;
import chapter28.bean.User;

public class Collection03<T extends User> {
    
    private T something;

    public T getSomething() {
        return something;
    }

    public void setSomething(T something) {
        this.something = something;
    }
    
    public static void main(String[] args) {
        Collection03<Boy> collection01 = new Collection03<>();
        collection01.setSomething(new Boy());
        Boy boy = collection01.getSomething();
        System.out.println(boy.getSex());
        
//        Collection01<BookEnglish> collection02 = new Collection01<>();
//        collection02.setSomething(new BookEnglish());
//        BookEnglish bookEnglish = collection02.getSomething();
//        System.out.println(bookEnglish.getType());
    }

}
