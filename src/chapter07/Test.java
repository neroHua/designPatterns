package chapter07;

/**
 * 
 * 原型模式
 * 用于克隆对象, 相对于创建对象的开销小很多很多
 * 浅克隆：复制对象内的基本类型复制值,引用类型复制地址;复制对象
 * 深克隆：复制对象内的基本类型复制值,引用类型复制值;复制对象,并递归复制对象内的对象
 * 
 * @author 滑德友
 * @time 2019年2月1日14:39:05
 *
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowCloneUser shallowCloneUser = new ShallowCloneUser();
        shallowCloneUser.setId(1);
        shallowCloneUser.setName("shallowCloneUserName");
        DeepCloneUser deepCloneUser = new DeepCloneUser();
        deepCloneUser.setId(1);
        deepCloneUser.setName("deepCloneUserName");
        
        ShallowClone shallowClone = new ShallowClone();
        shallowClone.setId(1);
        shallowClone.setName("shallowCloneName");
        shallowClone.setUser(shallowCloneUser);
        DeepClone deepClone = new DeepClone();
        deepClone.setId(1);
        deepClone.setName("deepCloneName");
        deepClone.setUser(deepCloneUser);
        
        ShallowClone shallowCloned = (ShallowClone)shallowClone.clone();
        DeepClone deepCloned = (DeepClone)deepClone.clone();
        
        ShallowCloneUser shallowClonedUser = shallowClone.getUser();
        DeepCloneUser deepClonedUser = deepCloned.getUser();
        
        System.out.println("clone: \t" + (shallowClone == shallowCloned));
        System.out.println("cloneId: \t" + (shallowClone.getId() == shallowCloned.getId()));
        System.out.println("cloneName: \t" + (shallowClone.getName() == shallowCloned.getName()));
        System.out.println("cloneUser: \t" + (shallowCloneUser == shallowClonedUser));
        System.out.println("cloneUserId: \t" + (shallowCloneUser.getId() == shallowClonedUser.getId()));
        System.out.println("cloneUserName: \t" + (shallowCloneUser.getName() == shallowClonedUser.getName()));
        
        System.out.println("clone: \t" + (deepClone == deepCloned));
        System.out.println("cloneId: \t" + (deepClone.getId() == deepCloned.getId()));
        System.out.println("cloneName: \t" + (deepClone.getName() == deepCloned.getName()));
        System.out.println("cloneUser: \t" + (deepCloneUser == deepClonedUser));
        System.out.println("cloneUserId: \t" + (deepCloneUser.getId() == deepClonedUser.getId()));
        System.out.println("cloneUserName: \t" + (deepCloneUser.getName() == deepClonedUser.getName()));

    }

}
