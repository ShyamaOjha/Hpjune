import java.util.Scanner;
public class Calu {
    public static void main(String[] args) {
        System.out.println("+ for 1,- for 2,* for 3,/ for 4");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter values");
        int a = sc.nextInt();
        int b = sc.nextInt();


        calculator ans=new calculator();
        int d;
        switch(x){
            case 1:
                d= ans.add(a,b);
                System.out.println(d);
            case 2:
                d =  ans.subt(a,b);
                System.out.println(d);
                break;
            case 3:
                d = ans.multi(a,b);
                System.out.println(d);
                break;
            case 4:
               d =  ans.divide(a,b);
                System.out.println(d);
                break;

            default:
                System.out.println("abe chutiye smjh ni aata kya");
        }

    }

}
