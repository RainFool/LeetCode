package android;

public class Handler {

    private Looper mLooper;
    private MessageQueue mQueue;

    public Handler() {
        mLooper = Looper.myLooper();
        mQueue = mLooper.messageQueue;
    }

    public void sendMessage(Message message) {
        message.target = this;
        // enqueue message
        mQueue.enqueueMsg(message);
    }

    protected void handleMessage(Message message) {

    }

    public void dispatchMessage(Message message) {
        handleMessage(message);
    }
}
