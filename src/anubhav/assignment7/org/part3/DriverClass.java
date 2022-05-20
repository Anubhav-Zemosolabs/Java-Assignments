package anubhav.assignment7.org.part3;

public class DriverClass {
    public static void method1(ParentInterface1 object){
        object.method1ParentInterface1();
    }
    public static void method2(ParentInterface2 object){
        object.method1ParentInterface2();
    }
    public static void method3(ParentInterface3 object){
        object.method1ParentInterface3();
    }
    public static void method4(ChildInterface object){
        object.methodChildInterface();
    }
    public static void main(String[] args) {
        ChildClass object=new ChildClass();
        method1(object);
        method2(object);
        method3(object);
        method4(object);
    }
}
