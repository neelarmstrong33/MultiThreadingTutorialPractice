package SynchronizedLockExample;

public class Main {
  public static void main(String[] args) {
    SharedResource resource = new SharedResource();
    Thread producer1 = new Thread(() -> {
      resource.produce();
    }, "Producer-1");

    SharedResource resource2 = new SharedResource();
    Thread producer2 = new Thread(() -> {
      resource2.produce();
    }, "Producer-2");

    producer1.start();
    producer2.start();
  }
}
