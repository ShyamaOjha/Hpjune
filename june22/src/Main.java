import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1= sc.nextInt();
        switch (x1){
            case 1:
                char a1=sc.next().charAt(0);
                if(a1=='c')
                {
                    Circle c1=new Circle();
                   c1.area();
                   c1.volume();
                }
                else{
              rectangle r1=new rectangle();
               r1.area();r1.volume();
                }
            break;
            case 2:
                Honda h1=new Honda();
                Hero h2=new Hero();
                TVS t1=new TVS();
                bullet b1=new bullet();
                h1.engine();h2.horn();t1.tyre();b1.headlight();
                break;
            case 3:
                redmi rd1=new redmi();rd1.vedio();
                infinix i1=new infinix();i1.camera();
                oneplus op1=new oneplus();op1.google();
                oppo o1=new oppo();o1.charger();
                vivo v1=new vivo();v1.youtube();
                samsung s1=new samsung();s1.sim();
                break;

    }

    }
}