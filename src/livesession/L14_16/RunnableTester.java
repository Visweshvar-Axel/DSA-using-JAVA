package livesession.L14_16;

public class RunnableTester implements Runnable{
    @Override
    public void run(){
        try {
        System.out.println("hi i'm from"+Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        for (int i = 0 ; i < 10; i++ ) {
            Thread hi = new Thread(new RunnableTester());
            hi.start();
        }
    }
}
