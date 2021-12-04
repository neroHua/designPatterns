package chapter05.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    List<CommandInterface> commandInterfaceList = new ArrayList<>();

    void storeCommand(CommandInterface commandInterface) {
        commandInterfaceList.add(commandInterface);
    }

    void executeCommand(int index) {
        commandInterfaceList.get(index).execute();
    }

}
