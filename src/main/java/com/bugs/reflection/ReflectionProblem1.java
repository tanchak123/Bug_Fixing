package main.java.com.bugs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionProblem1 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // deleted getClass for create userClass as User instance.
        Class userClass = User.class;
        Method[] methods = userClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

//         We can Create constructor with no arguments on User
//         Object object = userClass.newInstance();
//        (but this method more interesting for me)
        Constructor constructor = userClass.getDeclaredConstructor(String.class, String.class, int.class, String.class);
        constructor.setAccessible(true);
        Object object = constructor.newInstance("sanya", "san4enko", 123, "Alexandriya");
        if (object instanceof User) {
            User user = (User) object;
            System.out.println(user.getName()
            + "\n" + user.getSurName()
                    + "\n" + user.getCompanyName());
        }

    }

}


