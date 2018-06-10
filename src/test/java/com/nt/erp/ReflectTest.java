package com.nt.erp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public class ReflectTest {

    @MyAnnotation(1)
    private int a;
    
    public String b;
    
    public List<String>  c;
    
    public Map<String, String> d;
    
    
    public ReflectTest(){
        System.out.println("private ReflectTest");
    }
    
    private ReflectTest(String a){
        System.out.println("public ReflectTest");
    }
    
    public String getString(String a){
        return a;
    }
    
    
    public String getString(String a, String b){
        return a + b;
    }
    
    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("com.nt.erp.ReflectTest");
        
        Constructor constructor = clazz.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        constructor.newInstance("aaa");
        
        ReflectTest obj = (ReflectTest) clazz.newInstance();
        Field ff = clazz.getDeclaredField("b");
        ff.set(obj, "bb");
        System.out.println(obj.b);
        
        
        Method method = clazz.getDeclaredMethod("getString", String.class);
        System.out.println(method.invoke(obj, "getString"));
        
        
        Field aa = clazz.getDeclaredField("a");
        aa.setAccessible(true);
        MyAnnotation myAnnotation = aa.getAnnotation(MyAnnotation.class);
        aa.set(obj, myAnnotation.value());
        System.out.println(obj.a);
    }
    
    
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.FIELD})
    public @interface MyAnnotation{
        int value();
    }
}
