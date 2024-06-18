package livesession.L14_16;

public class ThreadTester extends Thread{
    public void run(){
        System.out.println("hi i'm from"+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        for (int i = 0 ; i < 10; i++ ) {
            Thread hi = new Thread(new ThreadTester());
            hi.start();
        }
    }
}
