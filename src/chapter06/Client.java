package chapter06;

/**
 * 
 * 建造者模式(Builder)
 * 建造某个复杂的对象
 * 
 * @author 滑德友
 * @time 2019年2月1日10:48:17
 *
 */
public class Client {

    public static void main(String[] args) {
        A a = new ABuilder().builder()
                .id(1L)
                .name("name")
                .age(1)
                .address("address")
                .company("company")
                .school("school")
                .phoneNumber("phoneNumber")
                .idCardNumber("idCardNumber")
                .passPortNumber("passPortNumber")
                .height(1.0)
                .weight(1.0)
                .build();
        
        System.out.println(a.getId());
        System.out.println(a.getName());
        System.out.println(a.getAge());
        System.out.println(a.getAddress());
        System.out.println(a.getCompany());
        System.out.println(a.getSchool());
        System.out.println(a.getPhoneNumber());
        System.out.println(a.getIdCardNumber());
        System.out.println(a.getPassPortNumber());
        System.out.println(a.getHeight());
        System.out.println(a.getWeight());
        
    }
}
