public class MonitorThread1Runnable implements Runnable {
  private MultiThreadingLockExample1 lockExample;

  public MonitorThread1Runnable(MultiThreadingLockExample1 lockExample) {
    this.lockExample = lockExample;
  }

  @Override
  public void run() {
    lockExample.task1();
  }

}
