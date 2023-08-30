import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        switch (x1) {
            case 1:
                int x= sc.nextInt();
                int y= sc.nextInt();

                int temp=0;
                temp=x;
                x=y;
                y=temp;

                System.out.print(x+" "+y);
                break;

            case 2:
                int x3= sc.nextInt();
                int sum=0; int c=x3;
                while(x3>0)
                {
                    int rem=x3%10;
                    sum=sum+(rem*rem*rem);
                    x3=x3/10;
                }
                if(c==sum)
                {
                    System.out.println("armstrong");
                }
                else {
                    System.out.print("not armstrong");
                }
                break;

            case 3:
                int x4= sc.nextInt();
                int sum1=0; int c1=x4;
                while(x4>0)
                {
                    int rem=x4%10;
                    sum1=sum1*10+rem;
                    x4=x4/10;
                }
                if(c1==sum1)
                {
                    System.out.println("palindnrome");
                }
                else {
                    System.out.print("not palind");
                }
                break;

            case 4:
                int x5= sc.nextInt();
                int a1=2;
                while(x5>=a1)
                {
                    if(x5%a1==0)
                    {
                        System.out.print("not prine");
                        break;

                    }
                    if(x5-1==a1)
                    {
                        System.out.print("prime ");
                        break;
                    }
                    a1++;
                }
                break;
            case 5:
                int r1= sc.nextInt();
                int c2= sc.nextInt();

                for(int i=1;i<=r1;i++)
                {    int n=0;

                    for(int j=1;j<=c2;j++)
                    {
                        System.out.print((n+i)+" ");
                        n=n+5;
                    }
                    System.out.println();
                }
        }



    }
}