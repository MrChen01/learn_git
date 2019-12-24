package cn.itcast.self;

import com.sun.media.sound.SoftTuning;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName MainTest
 * @Desciption
 * @Author ³Â×¿ÐÅ
 * @Date 2019/12/18 16:15
 * @Version 1.0
 **/
public class MainTest {
    public static void main(String[] args) throws Exception {
        Class<User> aClass = (Class<User>) Class.forName("cn.itcast.self.User");
        System.out.println(aClass);

//        System.out.println("-------------------");
//        Field id = aClass.getDeclaredField("id");
//        System.out.println(id);
//        System.out.println(id.getName());
//
        System.out.println("-------------------");
        for (Field field : aClass.getFields()) {
            System.out.println(field);
        }

        System.out.println("-------------------");
        for (Field declaredField : aClass.getDeclaredFields()) {
            System.out.println(declaredField);
        }

        System.out.println("-------------------");

        for (Method method : aClass.getMethods()) {
            System.out.println(method);
//            System.out.println(method.getName());
        }
        System.out.println("-------------------");
        for (Method declaredMethod : aClass.getDeclaredMethods()) {
            System.out.println(declaredMethod);
        }

//        System.out.println("-------------------");
//
//        for (Constructor<?> constructor : aClass.getConstructors()) {
//            System.out.println(constructor);
//        }
//
//        System.out.println("-------------------");
//
//        for (Annotation annotation : aClass.getAnnotations()) {
//            System.out.println(annotation);
//        }


    }
}
