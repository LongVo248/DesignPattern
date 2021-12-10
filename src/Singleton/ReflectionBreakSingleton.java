package Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class ReflectionBreakSingleton {

    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException, InvocationTargetException {

        Early instanceOne = Early.getA();
        Early instanceTwo = null;

        Constructor<?>[] constructors = Early.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            instanceTwo = (Early) constructor.newInstance();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
