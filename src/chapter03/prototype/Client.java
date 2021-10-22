package chapter03.prototype;

import chapter03.prototype.bean.User;

public class Client {
    public static void main(String[] args) {
        User user = new User(1, "name01");
        User userShallow = (User) user.clone();

        System.out.println(user.getName() == userShallow.getName());
    }
}
