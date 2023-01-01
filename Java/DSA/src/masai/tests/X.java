package masai.tests;

public interface X {

    int i = 0;
    void method1();

    static void method2(){
        System.out.println("m2");
    }

    default void method3(){
        System.out.println("m3");
    }

    class Ximpl implements X{

//        public Ximpl() {
//            i = 20;
//        }

        @Override
        public void method1() {

        }

        @Override
        public void method3() {
            X.super.method3();
        }

        public static void main(String[] args) {
            Ximpl x = new Ximpl();
            x.method1();
            x.method3();
            X.method2();

//            String a = "sir";
//            String b = new String("sir");
//            String c = new String("sir");
//
//            System.out.println(a == b);
//            System.out.println(b == c);


            try{
                int a = 100/0;
                System.out.println("A");
            }catch (Exception e){
                System.out.println("B");
                throw new ArithmeticException();
            }finally {
                System.out.println("C");
            }

            System.out.println("D");
//
//            byte b =10;
//            byte c = b + 11;
//            System.out.println();
        }
    }


}
