import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {


        for (int i=5;i>=1;i--) {
            System.out.print("*");
        }
        for (int j=0;j<=2;j++) {
            if (j != 0) {
                for (int k = 1; k <= i; k++) {
                    System.out.print(" ");
                }
            }
        }



    }
}