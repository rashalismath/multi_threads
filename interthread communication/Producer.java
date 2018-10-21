
package threads;

public class Producer implements Runnable{
    Q q ;
    
    Producer(Q q){
        this.q=q;
       Thread thread1=new Thread(this);
        thread1.start();
    }
    
    public void run() {
        int i=0;
        
        while(true){
            q.put(i++);
            try{    Thread.sleep(1000);} catch(Exception e){}
            
        }
    
    }
    
}
