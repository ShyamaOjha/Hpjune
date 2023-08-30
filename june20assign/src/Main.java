import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of question");
        int x1= sc.nextInt();
        switch (x1) {
            case 1:
                System.out.print("enter a = ");
                int p= sc.nextInt();
                System.out.print("enter b= ");
                int q= sc.nextInt();
                single s=new single();
                s.add(p,q);
            break;

            case 2:
                androidphone a1=new androidphone();
                a1.model();
                a1.display();
                a1.smartdisplay();
                break;

            case 3:
                System.out.println("enter the first number = ");
                int a4= sc.nextInt();
                System.out.println("enter the second number = ");
                int b4= sc.nextInt();
                System.out.println("enter the third number = ");
                int c4= sc.nextInt();

                setorget s1=new setorget();
                s1.setx(a4); s1.sety(b4); s1.setz(c4);
                s1.display();
            break;

            case 4:
                System.out.println("enter the first number = ");
                int a5= sc.nextInt();
                System.out.println("enter the second number = ");
                int b5= sc.nextInt();

                calsetget ca1=new calsetget();
                ca1.setx(a5); ca1.sety(b5);
                ca1.add(); ca1.sub(); ca1.mul(); ca1.divi(); ca1.mod();
                break;

            case 5:
               dog d1=new dog();
               cat c1=new cat();
               d1.bark();
               c1.meow();
               d1.display();
               c1.display();
               break;

            case 6:
            pencil p1=new pencil();
            pen p2=new pen();
            eraser e1=new eraser();

            p1.pencil(); p2.pens(); e1.erase(); e1.station(); p2.station(); p1.station();
            break;

            case 7:
                System.out.println("enter first number = ");
                p=sc.nextInt();
                System.out.println("enter second number = ");
                q= sc.nextInt();
                Z z1=new Z();    /*for sum*/
                Y y1=new Y();    /*for sub*/
                C c3=new C();    /*for mulitply*/
                V v3=new V();    /*for divi*/
                z1.z(p,q);
                y1.y(p,q);
                c3.c(p,q);
                v3.v(p,q);
                break;
        }
    }
}