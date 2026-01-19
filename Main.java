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

    /*
     * // Consumer-Producer Example
     * System.out.println("Going inside the main method: " +
     * Thread.currentThread().getName());
     * SharedResource sharedResource = new SharedResource();
     * Thread producerThread = new Thread(new ProducerTask(sharedResource));
     * Thread consumerThread = new Thread(new ConsumerTask(sharedResource));
     * 
     * producerThread.start();
     * consumerThread.start();
     * 
     * System.out.println("Finish main method : " +
     * Thread.currentThread().getName());
     */

    /*
     * // Thread Suspension and Resumption Example
     * SharedResource1 resource1 = new SharedResource1();
     * 
     * System.out.println("Going inside the main method: " +
     * Thread.currentThread().getName());
     * 
     * Thread thread1 = new Thread(() -> {
     * System.out.println("Thread1 calling the produce method: " +
     * Thread.currentThread().getName());
     * resource1.produce();
     * });
     * 
     * Thread thread2 = new Thread(() -> {
     * try {
     * // Ensuring thread2 starts after thread1
     * Thread.sleep(1000);
     * } catch (InterruptedException e) {
     * e.printStackTrace();
     * }
     * System.out.println("Thread2 calling the produce method: " +
     * Thread.currentThread().getName());
     * resource1.produce();
     * });
     * 
     * thread1.start();
     * thread2.start();
     * 
     * try {
     * Thread.sleep(3000);
     * } catch (Exception e) {
     * // TODO: handle exception
     * }
     * System.out.println("Main thread suspended Thread1: " + thread1.getName());
     * thread1.suspend();
     * 
     * thread1.resume();
     * System.out.println(" Finish main method : " +
     * Thread.currentThread().getName());
     */

    /*
     * // Thread Joins Example
     * SharedResource1 resource1 = new SharedResource1();
     * 
     * System.out.println("Going inside the main method: " +
     * Thread.currentThread().getName());
     * 
     * Thread thread1 = new Thread(() -> {
     * System.out.println("Thread1 calling the produce method: " +
     * Thread.currentThread().getName());
     * resource1.produce();
     * });
     * 
     * thread1.start();
     * 
     * try {
     * System.out.println("Main thread waiting for Thread1 to finish: " +
     * thread1.getName());
     * thread1.join();
     * } catch (Exception e) {
     * // TODO: handle exception
     * }
     * System.out.println("Finish main method : " +
     * Thread.currentThread().getName());
     */

    /*
     * // Thread Priorities Example
     * SharedResource1 resource1 = new SharedResource1();
     * 
     * System.out.println("Going inside the main method: " +
     * Thread.currentThread().getName());
     * 
     * Thread thread1 = new Thread(() -> {
     * System.out.println("Thread1 calling the produce method: " +
     * Thread.currentThread().getName());
     * resource1.produce();
     * });
     * 
     * thread1.setPriority(Thread.MAX_PRIORITY);
     * thread1.start();
     */

    // Thread Daemon Example
    SharedResource1 resource1 = new SharedResource1();

    System.out.println("Going inside the main method: " + Thread.currentThread().getName());

    Thread thread1 = new Thread(() -> {
      System.out.println("Thread1 calling the produce method: " + Thread.currentThread().getName());
      resource1.produce();
    });

    thread1.setDaemon(true);
    thread1.start();

    System.out.println("Finish main method : " + Thread.currentThread().getName());
  }
}