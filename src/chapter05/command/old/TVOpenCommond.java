package chapter05.command.old;

public class TVOpenCommond implements Commond {

    private TV TV;

    public TVOpenCommond(TV TV) {
        this.TV = TV;
    }

    @Override
    public void execute() {
        TV.open();
    }

}
