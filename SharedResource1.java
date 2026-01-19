public class SharedResource1 {

  boolean isAvailable = false;

  public synchronized void produce() {
    System.out.println("Lock Acquire");
    isAvailable = true;
    try {
      Thread.sleep(8000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Lock released");
  }
}
