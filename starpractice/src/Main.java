//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("enter the row = ");
//        int r=sc.nextInt();
//        System.out.print("enter the table from which you want to start = ");
//        int n=sc.nextInt();
//
//        for (int i=r;i>=1;i--)
//        {
//            for (int j=1;j<=i;j++)
//            {
//                System.out.print(n*j+" ");
//            }
//            n++;
//            System.out.println(" ");
//        }
//
//    }
//}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        practicesta sd = new practicesta(101, "amit");
        practicesta sd1 = new practicesta(102, "roop");
        practicesta.school_name="vaibhav school";
        System.out.println(sd.id + " ," + sd.name + " ," + sd.course_name + " ," + practicesta.school_name);
        System.out.println(sd1.id + " ," + sd1.name + " ," + sd.course_name + " ," + practicesta.school_name);
        sd.display();
    }
}