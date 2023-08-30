interface A{
    void show(); //decalre public abstract static
}
interface C{
    default void yo(){
        System.out.println("this is deaufault c");
    }
    void display();
}
class B implements A,C{
    @Override
    public void show() {
        System.out.println("this is b");
    }

    @Override
    public void display() {
        System.out.println("this is class b ");
    }
}
public class Main {
    public static void main(String[] args) {
        B b1=new B();
        b1.show();
        b1.yo();
        b1.display();

    }
}
