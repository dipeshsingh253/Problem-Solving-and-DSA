package masai.tests;

public class ABImpl implements InterfaceA,InterfaceB{

    public static void main(String[] args) {
        InterfaceB ab = new ABImpl();
        System.out.println(InterfaceA.i);
    }

}
