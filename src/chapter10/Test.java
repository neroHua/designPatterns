package chapter10;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 过滤器模式
 * 在mongodb的api中经常能看到该模式的影子
 * 
 * @author 滑德友 
 * @time 2019年2月11日13:21:01
 *
 */
public class Test {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person(1, "名称01", 100, true);
        Person person2 = new Person(2, "名称02", 200, true);
        Person person3 = new Person(3, "名称03", 300, false);
        Person person4 = new Person(4, "名称04", 400, true);
        Person person5 = new Person(5, "名称05", 500, false);
        personList.add(person1); 
        personList.add(person2); 
        personList.add(person3); 
        personList.add(person4); 
        personList.add(person5); 

        PersonFilter personFilter = new AgeEqualPersonFilter(1);
        List<Person> filterPersonList = personFilter.filter(personList);

        System.out.println(filterPersonList.size());
    }

}
