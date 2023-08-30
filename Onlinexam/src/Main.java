import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int userid1=sc.nextInt();
        String username1=sc.nextLine();
        String loginID=sc.nextLine();
        String Password=sc.nextLine();
        Onlineexam obj=new Onlineexam( userid1,username1);

        if(obj.loginID.equals("null"))
        {
            obj.signUp(loginID,Password,obj);
            System.out.println(obj.loginID);
            System.out.println(obj.password);
        }
        int x=sc.nextInt();
        System.out.println("press 0 for already give your exam");

        if(x==0){
            System.out.println("thanking you for giving online test");
            }
        int z= sc.nextInt();
        if(z==0) {
            System.out.println("wecloem to c online test");
            obj.testC();
        }
            else {
            System.out.println("welcome to java exam");
            obj.testJava();
        }
    }
}
