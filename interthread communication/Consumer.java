package threads;

public class Consumer implements Runnable {

    Q q;

    Consumer(Q q) {
        this.q = q;
        Thread thread=new Thread(this);
        thread.start();
    }

    public void run() {
      

        while (true) {
                  q.get();
                  try{    Thread.sleep(1000);} catch(Exception e){}
        }

    }
}
