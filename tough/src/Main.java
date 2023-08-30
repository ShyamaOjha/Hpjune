import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x1= sc.nextInt();
        switch(x1){
            case 1:
                int r= sc.nextInt();
                int c= sc.nextInt();
                for(int i=1;i<=r;i++)
                {
                    for(int j=c-i;j>=1;j--)
                    {
                        System.out.print(" ");
                    }
                    for(int k=1;k<=i;k++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                int r1= sc.nextInt();
                int c1= sc.nextInt();


                for(int i=1;i<=r1;i++)
                {
                        int n=0;
                    for(int j=r1-i;j>=1;j--)
                    {
                        System.out.print(" ");
                    }
                    for(int k=1;k<=(i);k++)
                    {
                        System.out.print(" "+(n+k));
                    }
                    System.out.println();
                }
                break;

        }
    }
}