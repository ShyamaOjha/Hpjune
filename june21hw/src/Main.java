import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1= sc.nextInt();
        switch(x1)
        {
            case 1:
                System.out.println("enter the name = ");
                String s1= sc.nextLine();
                sc.nextLine();
                System.out.println("enter the age = ");
                int x2= sc.nextInt();
                person p1=new person(s1,x2);
                System.out.println(p1.name);
                System.out.println(p1.age);
                break;

            case 2:
            System.out.println("enter the length");
            int l1= sc.nextInt();
            System.out.println("enter the breadth");
            int b1= sc.nextInt();
            rectangle r1=new rectangle();
            r1.area(l1,b1);
            break;

            case 3:
            System.out.print("enter the radius = ");
            int r4= sc.nextInt();
            circle c4=new circle();
            c4.area(r4);
            c4.circumference(r4);
            break;

            case 4:
            String j2= sc.next();
            if(j2.equals("square")){
            square1 sq1=new square1();
            int sq5= sc.nextInt();
            sq1.areasq(sq5);}
            else if(j2.equals("rectangle"))
            {
            Rectangle1 ra1=new Rectangle1();
            System.out.print("enter lenght = ");
            int ra21= sc.nextInt();
            System.out.print("enter bredth = ");
            int ra22= sc.nextInt();
            ra1.area12(ra21,ra22);
            ra1.perimter2(ra21,ra22);
            }
            else{
            circle1 cl1=new circle1();
            System.out.println("enter the radius = ");
            int c21= sc.nextInt();
            cl1.area5(c21);
            cl1.circumference1(c21);

            }
            break;

            case 5:
                String j1= sc.next();
                Green g1=new Green();
                if(j1.equals("red")){
                    g1.displayred(j1);
                }
                else if(j1.equals("yellow"))
                {
                    g1.displayyellow(j1);
                }
               else {
                    g1.displaygreen(j1);
                }
            break;
            case 6:
                D d1=new D();
                d1.display();
            break;
        }

    }
}