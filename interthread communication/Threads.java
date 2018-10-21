
package threads;

public class Threads {

  
    public static void main(String[] args) {

        Q a=new Q();
        Producer c=new Producer(a);
        Consumer b=new Consumer(a);
        
    }
}
