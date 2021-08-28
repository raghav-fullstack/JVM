package ClassLoading;

import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("ClassLoading.User");

        Method[] declaredMethods = c.getDeclaredMethods();

        for (Method method : declaredMethods) {
            System.out.println(method.getName());
        }
        System.out.println(declaredMethods.length);


    }
}
