package ua.lviv.lgs;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        RunnableThread runnableThread = new RunnableThread();
        Thread thread1 = new Thread(runnableThread);
        thread.start();
        thread1.start();
    }
}
