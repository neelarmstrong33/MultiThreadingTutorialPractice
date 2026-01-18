public class ProducerTask implements Runnable {

  SharedResource sharedResource;

  public ProducerTask(SharedResource resource) {
    this.sharedResource = resource;
  }

  @Override
  public void run() {
    System.out.println("Producing thread: " + Thread.currentThread().getName());
    try {
      Thread.sleep(5000L); // simulate time taken to produce an item
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    sharedResource.addItem();
  }
}