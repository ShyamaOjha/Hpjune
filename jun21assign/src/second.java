class A1{
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
class B1 extends A1 {
    int b;

    void setB(int b){
        this.b=b;
    }
    int getB()
    {
        return b;
    }

    @Override
    void display1() {
        System.out.println("sum = "+(a+b));
    }
}
