package chapter02.command;

public class QuitCommand implements Command {

    @Override
    public void execute() {
        new SaveCommand().execute();
    }

    @Override
    public void unExecute() {

    }

}
