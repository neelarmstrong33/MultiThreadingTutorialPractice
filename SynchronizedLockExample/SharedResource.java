package SynchronizedLockExample;

public class SharedResource {

  boolean isAvailable = false;

  public synchronized void produce() {
    try {
      System.out.println("Lock acquired by : " + Thread.currentThread().getName());
      isAvailable = true;
      Thread.sleep(3000);
    } catch (Exception e) {
      // TODO: handle exception
    }

    System.out.println("Lock released by : " + Thread.currentThread().getName());
  }

}
