import java.util.Scanner;
class A{
//    int add(int a,int b){
//        int c=a+b;
//        return c;
//    }
//    int sub(int a,int b){
//        int c=a-b;
//        return c;
//    }
//    int mul(int a,int b){
//        int c=a*b;
//        return c;
//    }int divi(int a,int b){
//        int c=a/b;
//        return c;
//    }
void add(int a,int b){
    int c=a+b;
    System.out.println(c);
}
    void sub(int a,int b){
        int c=a-b;
        System.out.println(c);
    }
    void mul(int a,int b){
        int c=a*b;
        System.out.println(c);
    }void divi(int a,int b){
        int c=a/b;
        System.out.println(c);
    }


}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p= sc.nextInt();
        int q= sc.nextInt();
        A a1=new A();
//        int r1= a1.add(p,q);
//        System.out.println(r1);
//        int r2= a1.sub(p,q);
//        System.out.println(r2);
//        int r3= a1.mul(p,q);
//        System.out.println(r3);
//        int r4= a1.divi(p,q);
//        System.out.println(r4);
        a1.add(p,q);
        a1.sub(p,q);
        a1.mul(p,q);
        a1.divi(p,q);

    }
}