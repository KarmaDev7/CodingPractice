package miscellaneous;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private static volatile Singleton instance;

    /**
     If through reflection it's made public then it will not create an object.
     **/
    private Singleton() {
        if (instance != null) {
            throw new InstantiationError("Error creating class");
        }
    }
    /**
     Thread-Safe code.
     **/

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    return new Singleton();
                }
            }
        }
        return null;
    }
    /**
     If someone tries to clone it then method will throw exception
     **/
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    Object readResolve() {
        return Singleton.getInstance();
    }
}
