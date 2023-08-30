import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        switch (a1) {
            case 1:
                int a = 2;
                int s = sc.nextInt();
                while (s > 0) {
                    if (s % a == 0) {
                        if (s - 1 == a) {

                        }
                        s++;
                        System.out.print(s);
                    }

                }
                break;

            case 2:
                int x4 = sc.nextInt();
                int sum = 0;
                int c = x4;
                while (x4 > 0) {
                    int rem = x4 % 10;
                    sum = sum + (rem * rem * rem);
                    x4 = x4 / 10;
                }
                if (c == sum) {
                    System.out.print("armstrong");
                } else {
                    System.out.print("not armstrong");
                }
                break;
            case 3:
                int l = sc.nextInt();
                int m = sc.nextInt();
                int temp = 0;

                temp = l;
                l = m;
                m = temp;
                System.out.print(l + " " + m);
                break;
            case 4:
                int r1 = sc.nextInt();
                int c1 = sc.nextInt();
                for (int i = 1; i <= r1; i++) {
                    for (int j = 1; j <= c1; j++) {
                        if (i % 2 == 0 || (i + j) % 2 == 0) {
                            System.out.print(0);
                        } else {
                            System.out.print(1);
                        }
                    }
                    System.out.println();
                }
            case 5:
                int r2 = sc.nextInt();
                int c2 = sc.nextInt();
                for (int i = 1; i <= r2; i++) {
                    for (int j = 1; j <= c2; j++) {
                        if (i % 2 == 0 || (i + j) % 2 != 0) {
                            System.out.print(0);
                        } else {
                            System.out.print(1);
                        }
                    }
                    System.out.println();
                }
                break;
            case 6:
                int r3 = sc.nextInt();
                int c3 = sc.nextInt();
                for (int i = 1; i <= r3; i++) {
                    for (int j = 1; j <= c3; j++) {
                        if ((j) % 2 != 0) {
                            System.out.print(0);
                        } else {
                            System.out.print(1);
                        }
                    }
                    System.out.println();
                }
                break;
            case 7:
                int r4 = sc.nextInt();
                int c4 = sc.nextInt();
                for (int i = 1; i <= r4; i++) {
                    for (int j = 1; j <= c4; j++) {
                        if ((j) % 2 == 0) {
                            System.out.print(0);
                        } else {
                            System.out.print(1);
                        }
                    }
                    System.out.println();
                }
                break;
            case 8:
                int r5 = sc.nextInt();
                for (int i = 1; i <= r5; i++) {
                    int n = 1;
                    for (int j = 1; j <= i; j++) {
                        System.out.print(n * i);
                        n++;
                    }
                    System.out.println();
                }
                break;

            case 9:
                int r6 = sc.nextInt();
                for (int i = 1; i <= r6; i++) {
                    int n = 1;
                    for (int j = 1; j <= i; j++) {
                        if (i % 2 == 0) {
                            System.out.print(0);
                        } else {
                            System.out.print(1);
                        }
                        n++;
                    }
                    System.out.println();
                }
                break;
            case 10:
                int r7 = sc.nextInt();
                for (int i = 1; i <= r7; i++) {
                    int n = 1;
                    for (int j = 1; j <= i; j++){
                        if (j % 2== 0) {
                            System.out.print(0);
                        } else {
                            System.out.print(1);
                        }
                    n++;

                }
                    System.out.println();
                }
                break;
            case 11:
                int r8 = sc.nextInt();
                int c9= sc.nextInt();
                for (int i = 1; i <= r8; i++) {
                    int n= 1;
                    for (int j = 1; j <= c9; j++){

                        System.out.print(n+" ");
                        n=n+2;

                    }
                    System.out.println();
                }
                break;
        }
    }
}
