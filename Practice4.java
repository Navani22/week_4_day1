
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
  
  public class Practice4 {
    public static void main(String[] args) {
      th1 t1 = new th1();
      t1.setPriority(6);
      th2 t2 = new th2();
      t2.setPriority(5);
      System.out.println("State of t1 before: "+t1.getState());
      System.out.println("State of t2 before: "+t2.getState());
      t1.start();
      t2.start();
     // System.out.println(t1.getPriority());
     // System.out.println(t2.getPriority());
      System.out.println("State of t1 after: "+t1.getState());
      System.out.println("State of t2 after: "+t2.getState());
  
    }
  }