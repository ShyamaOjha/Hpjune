public class college {
   static int id;
    String name;
    String qualification;
    int di;
    public college(String graduate) {
        this.qualification =graduate;
    }
    public college(int id,String name,String Stream){
            this("graduate");
            this.id=id;
            this.name=name;
    }
    public college(int id,String name,String Stream, int di){
        this("Postgraduate",10);

        this.id=id;
        this.name=name;
        this.di=di;
    }
    public college(String Postgraduate, int n) {
        this.qualification = Postgraduate;
    }

}

//public class Main
//{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number to check whether it is prime");
//        int n=sc.nextInt();
//
//        int a=n;
//        int r;
//        int SUM=0;
//        while (n>0)
//        {
//            r=n%10;
//            SUM=SUM*10+r;
//            n=n/10;
//        }
//
//
//        if(a==SUM)
//            System.out.print("PALIN");
//        else
//            System.out.print("NOT PALIN");
//    }
//}

//import java.util.Scanner;
//public class Main
//{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number to check whether it is armstrong");
//        int n=sc.nextInt();
//
//        int a=n;
//        int r;
//        int SUM=0;
//        while (n!=0)
//        {
//            r=n%10;
//            SUM=SUM+(r*r*r);
//            n=n/10;
//        }
//
//
//        if(a==SUM)
//            System.out.print("armstrong");
//        else
//            System.out.print("NOT armstorn");
//    }
//}

