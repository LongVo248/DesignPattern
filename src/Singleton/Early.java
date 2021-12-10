package Singleton;

public class Early {
    private static final Early early = new Early();//early

    private Early() {

    }

    public static Early getA() {
        return early;
    }

    public void doSomething() {

    }
}
