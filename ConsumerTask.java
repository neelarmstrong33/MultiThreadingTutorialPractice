public class ConsumerTask implements Runnable {

  SharedResource sharedResource;

  public ConsumerTask(SharedResource resource) {
    this.sharedResource = resource;
  }

  @Override
  public void run() {
    System.out.println("Consuming thread: " + Thread.currentThread().getName());
    sharedResource.consumeItem();
  }
}