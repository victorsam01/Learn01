package Learning;

import java.awt.*;

class ThreadTest implements Runnable {
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println("TestThread : "+i);
        }
    }
}
public class MyThread1 {
    public static void main(String[] args) {
        ThreadTest tt = new ThreadTest();
        Thread t = new Thread(tt);
        t.start();
    }
}
