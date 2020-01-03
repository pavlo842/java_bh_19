package by.belhard.j19.lessons.lesson8.checkedExceptions;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Entity {

    public Entity getNewInstance() throws
            ClassNotFoundException,
//            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {
//        File file = new File("/Mainggg.class");
        Class<?> aClass = Class.forName("by.belhard.j19.lessons.lesson8.checkedExceptions.Entity");

        Constructor<?> constructor = null;
        try {
            constructor = aClass.getConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
//        return file.getCanonicalPath();
        return (Entity) constructor.newInstance();
    }

//    public int getTemp() {
//        return (int) (Math.random() * 25);
//    }

}
