package behavioral.chainofresponsibility.solution;

public abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // allow each agent to have their own implementation
    public abstract void handleRequest(String requestType);
}
