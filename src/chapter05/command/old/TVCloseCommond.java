package chapter05.command.old;

public class TVCloseCommond implements Commond {

    private TV TV;

    public TVCloseCommond(TV TV) {
        this.TV = TV;
    }

    @Override
    public void execute() {
        TV.close();
    }

}
