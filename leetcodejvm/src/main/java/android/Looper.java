package android;

public class Looper {


    private static ThreadLocal<Looper> mThreadLocal = new ThreadLocal<>();

    final MessageQueue messageQueue = new MessageQueue();

    public static void prepare() {
        if (mThreadLocal.get() != null) {
            // throw exception
        }

        mThreadLocal.set(new Looper());
    }

    public static Looper myLooper() {
        return mThreadLocal.get();
    }

    public static void loop() {
        Looper me = myLooper();
        Message msg;
        for (; ; ) {
            msg = me.messageQueue.next();
            if (msg == null) {
                // 空消息
            }
            msg.target.dispatchMessage(msg);
        }
    }
}
