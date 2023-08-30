import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a2 = sc.nextInt();
        switch (a2) {
            case 1:
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();
                char a1 = 97;
                for (int i = 1; i <= x1; i++) {

                    for (int j = 1; j <= y1; j++) {
                        System.out.print((a1));
                        a1++;
                    }
                        System.out.println();

                    }
                break;
            case 2:
                int x5 = sc.nextInt();
                for (int i = 1; i <= x5; i++) {
                    char a4 = 97;
                    for (int j = 1; j <= i; j++) {
                        System.out.print((a4));
                        a4++;
                    }
                    System.out.println();
                }
                break;

            case 3:
                int x3 = sc.nextInt();

                char a4 = 97;
                for (int i = 1; i <= x3; i++) {

                    for (int j = 1; j <= i; j++) {
                        System.out.print((a4));

                    }
                    a4++;
                    System.out.println();
                }
                break;
            case 4:
                int x8 = sc.nextInt();
                int x9= sc.nextInt();
                int h9=1;
                for (int i = 1; i <= x8; i++) {
                    for (int j = 1; j <= x9; j++) {
                        if(i!=j)
                        {
                            System.out.print(h9);
                            h9++;
                        }
                        else {
                            System.out.print("*");

                        }
                    }
                    System.out.println();
                }
                break;
            case 5:
                int j8 = sc.nextInt();
                int j9= sc.nextInt();

                for (int i = 1; i <= j8; i++) {
                    int x=1;
                    for (int j = 1; j <= j9; j++) {
                        if (i + j==6) {
                            System.out.print("*");
                        }

                        else {
                            System.out.print(x);
                            x++;
                        }
                    }
                    System.out.println();
                }
                break;




                }
        }
    }
