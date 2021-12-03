package chapter05.command.old;

public class TVChangeCommond implements Commond {

    private TV TV;

    public TVChangeCommond(TV TV) {
        this.TV = TV;
    }

    @Override
    public void execute() {
        TV.change();
    }

}
