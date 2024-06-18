package livesession.L14_16;

public class RunnableTester implements Runnable{
    static int visitCount = 0;
    @Override
    public void run(){
        System.out.println("hi i'm from "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            visitCount++;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        for (int i = 0 ; i < 10; i++ ) {
            Thread hi = new Thread(new RunnableTester());
            hi.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
