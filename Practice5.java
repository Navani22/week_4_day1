
class th1 extends Thread {
    public void run() {
      for(int i=0; i<1;i++) {
        System.out.println("Good Morning");
      }
    }
  }
  
  class th2 extends Thread {
    public void run() {
          for(int i=0; i<1;i++) {
        System.out.println("Welcome!!");
      }
    }
  }
  
  public class Practice5 {
    public static void main(String[] args) {
      th1 t1 = new th1();
      t1.setPriority(6);
      th2 t2 = new th2();
      t2.setPriority(5);
    
      t1.start();
      t2.start();
  
      System.out.println(Thread.currentThread().getState());
  
    }
  }
