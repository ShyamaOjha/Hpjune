import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        switch (n)
        {
            case 1:
                int x= sc.nextInt();
                for(int i=1;i<=x;i++)
                {
                    for(int j=1;j<=x;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
              int y= sc.nextInt();
              for(int i=1;i<=y;i++)
              {
                  for(int j=1;j<=i;j++)
                  {
                      System.out.print("*");
                  }
                  System.out.println();
              }
              break;
            case 3:
                int z= sc.nextInt();
                for(int i=1;i<=z;i++)
                {
                    for(int j=1;j<=z;j++)
                    {
                        if(i==j || i+j==)
                    }
                }


        }


    }
}