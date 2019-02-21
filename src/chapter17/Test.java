package chapter17;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 命令模式
 * 感觉上只是指令调用者跟指令接收者解耦了，指令接收者和跟指令还是紧耦合的
 * 
 * @author 滑德友
 * @time 2019年2月r8日19:19:20
 *
 */
public class Test {

    public static void main(String[] args) {

        // 指令接收者，真正处理指令者
        TV TV = new TV();
        
        // 创建指令
        List<Commond> commondList = new ArrayList<>();
        commondList.add(new TVOpenCommond(TV));
        commondList.add(new TVChangeCommond(TV));
        commondList.add(new TVCloseCommond(TV));
        
        // 创建指令调用者
        CommondInvoker commondInvoker = new CommondInvoker(commondList);
        
        // 调用指令
        commondInvoker.exceute();

    }

}
