
class th1 extends Thread {
    public void run() {
      while (true) {
        System.out.println("Good Morning");
      }
    }
  }
  
  class th2 extends Thread {
    public void run() {
      while (true) {
        System.out.println("Welcome!!");
      }
    }
  }
  
  public class Practice3 {
    public static void main(String[] args) {
      th1 t1 = new th1();
      t1.setPriority(6);
      th2 t2 = new th2();
      t2.setPriority(5);
     // t1.start();
     // t2.start();
      System.out.println(t1.getPriority());
      System.out.println(t2.getPriority());
  
    }
  }