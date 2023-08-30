public class Main{
    public static void main(String []args)
    {
        Undergraduate U1=new Undergraduate("it","humainty","socialwork","electronic");
        Postgraduate p1=new Postgraduate("highit","social","practiec","metakugy","asf");
       College c1=new College(101,"AMIT",941395259,U1,p1);
        System.out.println(c1.pg.msw);
        System.out.println(Postgraduate.mcom);

        System.out.println(College.id);
        c1.display(101,"amit",234);
//        System.out.println(c1);

    }
        }