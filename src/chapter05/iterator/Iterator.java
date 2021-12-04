package chapter05.iterator;

import java.util.ArrayList;
import java.util.List;

public class Iterator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        java.util.Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
    }
}
