class circle1 extends Area{
    int r1;
    void setR1(int r1)
    {
        this.r1=r1;
    }
    int getR1()
    {
        return r1;
    }

    void circumference1(int r1)
    {
        System.out.println("circumference of circle = "+(2*(3.14*r1)));
    }
    void area5(int r1){
        double r15=3.14*(r1*r1);
        System.out.println("area of cirlce = "+(r15));
    }
}
class Rectangle1 extends Area{
    int l2,b2;
    void setl2(int l2)
    {
        this.l2=l2;
    }
    int getl2()
    {
        return l2;
    }
    void setb2(int b2)
    {
        this.b2=b2;
    }
    int getb2()
    {
        return b2;
    }
    void perimter2(int l2,int b2)
    {
        System.out.println("perimeter of rectangle = "+(2*(l2+b2)));
    }
    void area12(int l2,int b2){
        System.out.println("area of rectangle = "+(l2*b2));
    }

}
class square1 extends Area{
    int s1;
    void sets1(int s1)
    {
        this.s1=s1;
    }
    int gets1()
    {
        return s1;
    }
    void areasq(int s1)
    {
        System.out.println("area of square = "+(s1*s1));
    }
}
public class Area {
String areaper;
void display(String areaper)
{
    this.areaper=areaper;
}
}
