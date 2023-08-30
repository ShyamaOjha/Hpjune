import java.util.Scanner;

public class Evenodd {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        calu a1=new calu();
        a1.evenSolve(n);
    }
}
//import java.util.Scanner;
//public class Main
//{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        if(n<0)
//        {
//            n= Math.abs(n);
//            //  n=n*(-1);
//            System.out.print(n);
//        }
//
//        if(n%2==0)
//        {
//            System.out.println("\neven");
//        }
//        else
//        {
//            System.out.println("\nodd");
//        }
//
//
//    }
//}

