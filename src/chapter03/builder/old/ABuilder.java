package chapter03.builder.old;

public class ABuilder {

    private A a;
    
    public ABuilder builder() {
        a = new A();
        return this;
    }
    
    public A build() {
        return a;
    }

    public ABuilder id(Long id) {
        a.setId(id);
        return this;
    }
    public ABuilder name(String name) {
        a.setName(name);
        return this;
    }
    public ABuilder age(Integer age) {
        a.setAge(age);
        return this;
    }
    public ABuilder address(String address) {
        a.setAddress(address);
        return this;
    }
    public ABuilder company(String company) {
        a.setCompany(company);
        return this;
    }
    public ABuilder school(String school) {
        a.setSchool(school);
        return this;
    }
    public ABuilder phoneNumber(String phoneNumber) {
        a.setPhoneNumber(phoneNumber);
        return this;
    }
    public ABuilder idCardNumber(String idCardNumber) {
        a.setIdCardNumber(idCardNumber);
        return this;
    }
    public ABuilder passPortNumber(String passPortNumber) {
        a.setPassPortNumber(passPortNumber);
        return this;
    }
    public ABuilder height(Double height) {
        a.setHeight(height);
        return this;
    }
    public ABuilder weight(Double weight) {
        a.setWeight(weight);
        return this;
    }

}
