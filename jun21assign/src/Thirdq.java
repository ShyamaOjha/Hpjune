class A5{
    int a;

    void setA(int a){
        this.a=a;
    }
    int getA()
    {
        return a;
    }
    void display1(){
        System.out.println(a);
    }

}
class B5 extends A5 {
    int b;

    void setB(int b) {
        this.b = b;
    }

    int getB() {
        return b;
    }

}
class C5 extends B5 {
    int c;

    void setC(int c) {
        this.c=c;
    }

    int getC() {
        return c;
    }
    void add(){
        System.out.println("sum = "+(a+b+c));
    }

}


