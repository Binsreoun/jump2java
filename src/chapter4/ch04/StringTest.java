package chapter4.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("java.lang.String"); // 동적으로 클레스를 로딩함(필요할때마다 부르는것)

        Constructor[] cons = c.getConstructors();
        for(Constructor co : cons){
            System.out.println(co);
        }

        Method[] m = c.getMethods();
        for(Method mth : m){
            System.out.println(mth);
        }
    }
}
