import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter yes for 'y' or no for 'n' for medical cause = ");
        char m=sc.next().charAt(0);
        if(m=='n') { System.out.print("enter which question you want to show = ");
            int x1 = sc.nextInt();
            switch (x1) {
                case 1:
                    System.out.print("palindrome no check");
                    int a = sc.nextInt(); int sum = 0; int c = a;
                    while (a > 0) {
                        int rem = a % 10;
                        sum = (sum * 10) + rem;
                        a = a / 10; }
                    if (c == sum) { System.out.print("pallindrome"); }
                    else { System.out.print("not palindrome"); } break;
                case 2:
                    System.out.print("prime no check");
                    int b = sc.nextInt();
                    int a1 = 2;
                    while (b >= a1) {
                        if (b % a1 == 0) { System.out.print("not prime"); break; }
                        if (b - 1 == a1) { System.out.print("prime number"); break; } a1++; } break;

                case 3:
                    System.out.println("armstromg number check");
                    int d = sc.nextInt(); int sum1 = 0; int c5 = d;
                    while (d > 0) {
                        int rem1 = d % 10;
                        sum1 = sum1 + (rem1 * rem1 * rem1);
                        d = d / 10; }
                    if (sum1 == c5) { System.out.print("armstrong"); }
                    else { System.out.print("not armstorng"); } break;

                case 4:
                    System.out.println("swaping of two numbers");
                    int g = sc.nextInt(); int h = sc.nextInt(); int temp = 0;
                    temp = g; g = h; h = temp; System.out.print(g + " " + h); break;
                case 5:
                    System.out.println ("pattern 1 ");
                    System.out.print("enter the row = "); int r1 = sc.nextInt();
                    System.out.print("enter the column = "); int c1 = sc.nextInt();
                    for (int i = 1; i <= r1; i++) {
                        int n = 0;
                        for (int j = 1; j <= c1; j++) {
                            System.out.print((n + i) + " ");
                            n++; }
                        System.out.println(); } break;
                case 6:
                    System.out.println("pattern 2");
                    System.out.print("enter the row = "); int r2 = sc.nextInt();
                    System.out.print("enter the column = "); int c2= sc.nextInt();  int n = 0;
                    for (int i = 1; i <= r2; i++) {
                         for (int j = 1; j <= c2; j++) {
                            System.out.print((n + i) + " ");
                            n=n+2;
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    int r8=sc.nextInt();
                    for(int i=1;i<=n;i++)
                    {
                        for(int j=1;j<=;j++)
                        {

                        }
                        for(int k=1;k<=(2*i)-1;k++)
                        {

                        }
                    }

        } }
        else {
            System.out.print("you are not permit for exam,get well soon buddy");
        }
    }
}