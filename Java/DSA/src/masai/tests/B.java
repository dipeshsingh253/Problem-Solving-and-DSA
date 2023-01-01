package masai.tests;

import java.util.HashMap;
import java.util.Map;

public class B extends A {



    public B(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        B b = new B();

        Map<String,Integer> map = new HashMap<>();
        map.put("Amz",100000);

    }

}
class A{
    public A(){
        System.out.println("A");
    }
}