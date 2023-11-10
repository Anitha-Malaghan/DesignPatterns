package SingletonDesignPattern.Lazy;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ParameterizedDBConnectionWithLock {
    private static ParameterizedDBConnectionWithLock instance = null;
    private String url = null;
    private static Lock lock = new ReentrantLock();
    private ParameterizedDBConnectionWithLock(String url){
        this.url = url;
    };

    public static ParameterizedDBConnectionWithLock getInstance(String url) {
        if(instance == null) {
            lock.lock();
            if (instance == null) {
                instance = new ParameterizedDBConnectionWithLock(url);
            }
            lock.unlock();
        }

        return instance;
    }
}
