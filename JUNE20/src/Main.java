import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int p= sc.nextInt();
    int q= sc.nextInt();

    multilevel m1=new multilevel();
    m1.setA(p);
    m1.setB(q);
    m1.add();
    }
}