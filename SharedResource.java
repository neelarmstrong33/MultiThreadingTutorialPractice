public class SharedResource {

  boolean itemAvailable = false;

  // synchronized method put the monitor lock on 'this' object'
  public synchronized void addItem() {
    itemAvailable = true;
    System.out
        .println("Item added  by: " + Thread.currentThread().getName() + " and invoking all threads which are waiting");
    notifyAll(); // notify all waiting threads

  }

  public synchronized void consumeItem() {
    System.out.println("ConsumeItem method invoked by: " + Thread.currentThread().getName());
    while (!itemAvailable) {
      try {
        System.out.println("Thread " + Thread.currentThread().getName() + " is waiting now");
        wait(); // releases the lock and wait until notified
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("Item consumed by: " + Thread.currentThread().getName());
    itemAvailable = false;
  }
}
