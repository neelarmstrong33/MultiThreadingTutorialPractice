public class MultiThreadingLockExample1 {

  public synchronized void task1() {
    // do something
    try {
      System.out.println("inside task1 method: ");
      Thread.sleep(2000);
      System.out.println("Task1 completed");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public void task2() {
    System.out.println("task2, but before synchronized block");
    synchronized (this) {
      System.out.println("inside task2 method's synchronized block");
    }
  }

  public void task3() {
    System.out.println("inside task3 method, no synchronization");
  }

}
