
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
        try{
        Thread.sleep(200);
        System.out.println("Welcome");
        }
        catch (Exception e){
          System.out.println(e);
        }
      }
    }
  }
  
  public class Practice2 {
    public static void main(String[] args) {
      th1 t1 = new th1();
      th2 t2 = new th2();
      t1.start();
      t2.start();
  
    }
  }