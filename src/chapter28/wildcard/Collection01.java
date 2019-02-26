package chapter28.wildcard;

import chapter28.bean.BookEnglish;
import chapter28.bean.Boy;
import chapter28.bean.User;

public class Collection01<T> {
    
    private T something;

    public T getSomething() {
        return something;
    }

    public void setSomething(T something) {
        this.something = something;
    }
    
    public static void main(String[] args) {
        Collection01<Boy> collection01 = new Collection01<>();
        collection01.setSomething(new Boy());
        Boy boy = collection01.getSomething();
        System.out.println(boy.getSex());
        
        Collection01<BookEnglish> collection02 = new Collection01<>();
        collection02.setSomething(new BookEnglish());
        BookEnglish bookEnglish = collection02.getSomething();
        System.out.println(bookEnglish.getType());
        
        // 这部分看起来并没有什么用
        Collection01<? super User> collection03 = new Collection01<>();
        collection03.setSomething(new User());
        collection03.setSomething(new Boy());
//        collection03.setSomething(new Object());
    }

}
