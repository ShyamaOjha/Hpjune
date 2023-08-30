class A{
    int  a(int a)
    {
        return a;
    }
    int b(int b)
    {
        return b;
    }
}

public class single extends A{

    void add(int a,int b)
    {
        int c=a+b;
        System.out.print("sum = "+(a+b));
    }
}
