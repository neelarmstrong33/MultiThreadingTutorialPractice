public class Main {
  public static void main(String args[]) {
    /*
     * //Multi thread Example 1
     * System.out.println("Going inside the main method: " +
     * Thread.currentThread().getName());
     * MultiThreadingExample1 runnableobj = new MultiThreadingExample1();
     * Thread thread = new Thread(runnableobj);
     * thread.start();
     * System.out.println("Finish main method : " +
     * Thread.currentThread().getName());
     * }
     */

    /*
     * // Multi thread Example 2
     * System.out.println("Going inside the main method: " +
     * Thread.currentThread().getName());
     * MultiThreadingExample2 threadobj = new MultiThreadingExample2();
     * threadobj.start();
     * System.out.println("Finish main method : " +
     * Thread.currentThread().getName());
     */

    /*
     * // Multi thread Lock Example 1
     * MultiThreadingLockExample1 lockExample = new MultiThreadingLockExample1();
     * 
     * MonitorThread1Runnable monitor1 = new MonitorThread1Runnable(lockExample);
     * Thread t1 = new Thread(monitor1);
     * 
     * Thread t2 = new Thread(() -> lockExample.task2());
     * Thread t3 = new Thread(() -> lockExample.task3());
     * 
     * t1.start();
     * t2.start();
     * t3.start();
     * }
     */

    // Consumer-Producer Example
    System.out.println("Going inside the main method: " + Thread.currentThread().getName());
    SharedResource sharedResource = new SharedResource();
    Thread producerThread = new Thread(new ProducerTask(sharedResource));
    Thread consumerThread = new Thread(new ConsumerTask(sharedResource));

    producerThread.start();
    consumerThread.start();

    System.out.println("Finish main method : " + Thread.currentThread().getName());

  }
}