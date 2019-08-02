package singleton;

public class DoubleCheckLockingSingleton {
    private volatile DoubleCheckLockingSingleton singleton = null;
    private DoubleCheckLockingSingleton() {
    }

    public DoubleCheckLockingSingleton getSingleton(){
        if(singleton == null){
            synchronized (this){
                if(singleton == null){
                    singleton = new DoubleCheckLockingSingleton();
                }
            }
        }
        return singleton;
    }

}
