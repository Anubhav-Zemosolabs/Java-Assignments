package anubhav.assignment7.org.part5;

public class OuterClass2 {
    public class InnerClass2 extends OuterClass1.InnerClass1{
        public InnerClass2(int a, int b){
            new OuterClass1().super(a,b);
        }
    }
}
