import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter id = ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name = ");
        String name=sc.nextLine();
        System.out.print("Enter stream = ");
        String stream=sc.nextLine();

        college c1=new college(123,"ewr","sdf",4);
        System.out.println(college.id);
       /* college C;
        if (stream.equals("bsw"))
        {
            C=new college(id,name,stream);
            System.out.println(C.id);
            System.out.println(C.name);
            System.out.println(C.qualification);
        }
       else if (stream.equals("msw"))
        {
            int di= sc.nextInt();
            C=new college(id,name,stream,di);
            System.out.println(C.id);
            System.out.println(C.name);
            System.out.println(C.qualification);
            System.out.println(C.di);
        }
       else {
            System.out.println("please enter msw or bsw");
        }*/

    }
}