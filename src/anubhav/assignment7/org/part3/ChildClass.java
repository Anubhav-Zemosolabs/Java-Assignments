package anubhav.assignment7.org.part3;

public class ChildClass extends ConcreteClass implements ChildInterface{

    @Override
    public void methodChildInterface() {
        System.out.println("This is the method of child interface implemented" + " by Child Class");
    }

    @Override
    public void method1ParentInterface1() {
        System.out.println("This is the method 1 of parent interface 1 " + "implemented" + " by Child Class");
    }

    @Override
    public void method1ParentInterface2() {
        System.out.println("This is the method 1 of parent interface 2 " + "implemented" + " by Child Class");
    }

    @Override
    public void method2ParentInterface2() {
        System.out.println("This is the method 2 of parent interface 2 " + "implemented" + " by Child Class");
    }

    @Override
    public void method1ParentInterface3() {
        System.out.println("This is the method 1 of parent interface 3 " + "implemented" + " by Child Class");
    }

    @Override
    public void method2ParentInterface3() {
        System.out.println("This is the method 2 of parent interface 3 " + "implemented" + " by Child Class");
    }
}
