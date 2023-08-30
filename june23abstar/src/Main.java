public class Main {
    public static void main(String[] args) {
        A a1=new A() {
            @Override
            void add() {

            }
        };
    }
}

abstract class A{
    A(){}
    abstract void add();
}
class B extends A{
    void display()
    {
        System.out.println("this is b");
    }

    @Override
    void add() {
        System.out.println("tih is add");
    }
}