import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        switch (a){
            case 1:
                Mahindra m=new Mahindra();
                m.display();
                m.handle();
                m.stering();

            break;
            case 2:
            Animal b=new Animal(32);

                break;
            case 3:

            Calculator c1=new Calculator();
            int x1= sc.nextInt();
            int y1= sc.nextInt();
                System.out.println("addtion = "+c1.add(x1,y1));
                System.out.println("substraction = "+c1.sub(x1,y1));
                System.out.println("multiplication = "+c1.mul(x1,y1));
                System.out.println("divide = "+c1.divi(x1,y1));
            break;
        }


    }
}