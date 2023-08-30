import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a1= sc.nextInt();
switch(a1)
{
    case 1:
        single a2=new single();
        a2.display();
        a2.disp();
    break;
    case 2:
        multilevel m1=new multilevel();
        int x1= sc.nextInt();
        int x2= sc.nextInt();
        int x3= sc.nextInt();
        m1.setB(x1);m1.setC(x2);m1.setD(x3);
        m1.add();
    break;
    case 3:
        Y y1=new Y();
        Z z1=new Z();
        y1.displayY();
        z1.displayZ();
        break;
}
    }
}