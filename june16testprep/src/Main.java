import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        switch (a1) {
            case 1:
                int a = sc.nextInt();
                for (int i = 1; i <= a; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i * j);
                    }
                    System.out.println();
                }
            case 2:
                int b= sc.nextInt();
                for(int i=1;i<=b;i++)
                {
                    for(int j=1;j<=i;j++){
                        System.out.print(i);
                    }
                    System.out.println();
                }
                break;
            case 3:
                int c= sc.nextInt();
                int d= sc.nextInt();
                int n=1;
                for(int i=1;i<=c;i++)
                {

                    for(int j=1;j<=d;j++)
                    {
                        System.out.print(n+" ");
                        n++;
                    }
                    System.out.println();
                }
                break;

            case 4:
                int r1= sc.nextInt();
                int c1= sc.nextInt();
                int d1= sc.nextInt();

                for(int i=1;i<=r1;i++)
                {int n2=0;
                    for(int j=1;j<=c1;j++)
                    {
                        System.out.print((n2+i)+" ");
                        n2=n2+d1;
                    }
                    System.out.println();
                }
            break;
            case 5:
                int r4= sc.nextInt();
                int c4= sc.nextInt();
                int d2= sc.nextInt();

                for(int i=1;i<=r4;i++)
                {
                    int n=1;
                    for(int j=1;i<=c4;j++)
                    {
                        System.out.println(n+);
                    }
                }




        }
    }
}