package Singleton;

public class Lazy {
    private static Lazy lazy;

    private Lazy() {

    }

    public static Lazy getLazy() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }
}
