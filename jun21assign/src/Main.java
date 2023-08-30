import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the question which you want to see");
        int x1= sc.nextInt();
        switch (x1)
        {
            case 1:
            B b1=new B();
            b1.display();
            break;

            case 2:
                System.out.print("enter the a = ");
                int a1= sc.nextInt();
                System.out.print("enter the b = ");
                int a2= sc.nextInt();
                B1 b5=new B1();
                b5.setA(a1);b5.setB(a2); b5.display1();
                break;
            case 3:
                System.out.print("enter the a = ");
                int a3= sc.nextInt();
                System.out.print("enter the b = ");
                int a4= sc.nextInt();
                System.out.print("enter the c = ");
                int a5= sc.nextInt();
                C5 c1=new C5();
                c1.setA(a3);c1.setB(a4);c1.setC(a5);
                c1.add();
                break;
            case 4:
                J j1=new J();
                j1.show();
                break;
            case 5:
                child1 c9=new child1();
                child2 c10=new child2();
                c9.display();  c9.c1();
                c10.display(); c10.c2();
                break;

            case 6:



        }
    }
}