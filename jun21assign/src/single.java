class A{
    void display()
    {
        System.out.println("it is a");
    }
}
class B extends A {
    void display()
    {
        super.display();
        System.out.println("it is b");
    }
}
