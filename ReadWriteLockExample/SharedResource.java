package ReadWriteLockExample;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {

    boolean isAvailable = false;

    public void producer(ReadWriteLock lockApplied) {
        lockApplied.readLock().lock();
        try {
            System.out.println("Read lock acquired by: " + Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Read Lock relased by: " + Thread.currentThread().getName());
            lockApplied.readLock().unlock();
        }
    }

    public void consume(ReadWriteLock lockApplied) {
        lockApplied.writeLock().lock();
        try {
            System.out.println("Write lock acquired by: " + Thread.currentThread().getName());
            isAvailable = false;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Write Lock released by: "+ Thread.currentThread().getName());
            lockApplied.writeLock().unlock();
        }

    }
}
