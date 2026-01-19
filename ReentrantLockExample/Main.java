package ReentrantLockExample;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

  public static void main(String[] args) {

    ReentrantLock lockApplied = new ReentrantLock();

    SharedResource resource1 = new SharedResource();
    Thread producerThread1 = new Thread(() -> {
      resource1.producer(lockApplied);
    });

    SharedResource resource2 = new SharedResource();
    Thread producerThread2 = new Thread(() -> {
      resource2.producer(lockApplied);
    });

    producerThread1.start();
    producerThread2.start();

  }
}