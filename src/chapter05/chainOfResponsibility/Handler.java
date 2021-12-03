package chapter05.chainOfResponsibility;

public abstract class Handler {

    private Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public void handleRequest(Request request) {
        if (null != successor) {
            successor.handleRequest(request);
        }
    }

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
