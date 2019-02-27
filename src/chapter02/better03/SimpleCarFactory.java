package chapter02.better03;

public class SimpleCarFactory {

    public static <T extends BaseCar> T getCar(Class<T> className) throws InstantiationException, IllegalAccessException{
        return className.newInstance();
    }

}
