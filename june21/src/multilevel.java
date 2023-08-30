class B{

   int b;

    void setB(int b)
    {
        this.b=b;
    }
   int getB()
   {
       return b;
   }
}
class C extends B{
    int c;

    void setC(int c)
    {
        this.c=c;
    }
    int getC()
    {
        return c;
    }

}
public class multilevel extends C {

    int d;

    void setD(int d)
    {
        this.d=d;
    }
    int getD()
    {
        return d;
    }

    void add()
    {
        System.out.println(b+c+d);
    }

}
