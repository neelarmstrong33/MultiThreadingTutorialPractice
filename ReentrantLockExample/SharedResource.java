package ReentrantLockExample;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

  boolean isAvailable = false;

  public void producer(ReentrantLock lockApplied) {
    lockApplied.lock();
    try {
      System.out.println("Lock acquired by Producer :" + Thread.currentThread().getName());
      isAvailable = true;
      Thread.sleep(4000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      System.out.println("Lock released by Producer :" + Thread.currentThread().getName());
      lockApplied.unlock();
    }
  }
}