package android;

public class Driver {

    public static Handler handler;
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Looper.prepare();
                handler = new Handler() {
                    @Override
                    public void handleMessage(Message message) {
                        super.handleMessage(message);
                        System.out.println("Test：" + Thread.currentThread().getName() + "线程接收到：" + message.obj);
                    }
                };
                Looper.loop();
            }
        }).start();
        //睡0.5s，保证上面的线程中looper初始化好了
        Thread.sleep(500);
        new Thread(() -> {
            Message message = new Message();
            message.obj = Thread.currentThread().getName() + "发送的消息 ";
            handler.sendMessage(message);
        }).start();
        new Thread(() -> {
            Message message = new Message();
            message.obj = Thread.currentThread().getName() + "发送的消息 ";
            handler.sendMessage(message);
        }).start();
    }
}
