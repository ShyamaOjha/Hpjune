/*
public class Main extends object{
    Main(){
        super();
    }


    public static void main(String[] args)
    {
       Main A=new Main();
    }
}*/
/*class A{
    A(int a,int b)
    {
        System.out.println(a+" "+b);
    }
    A(int a)
    {
        System.out.println(a);
    }
}
public class Main{
    public static void main(String[] args) {
        A k=new A(1,2);
        A r=new A(132);
    }
}*/
/*class parent{
    void parent()
    {
        System.out.println("this si my parent");
    }

}
class child extends parent
{
    void child(){
        System.out.print("this is child class");
}
}
public class Main{
    public static void main(String[] args) {
        parent p=new parent();
        child c=new child();
        p.parent();
        c.child();
    }
}*/
class parent{
    void parent()
    {
        System.out.println("this si my parent");
    }

}
class child extends parent
{
    void parent(){
        //super.parent(); by using super keyword we can access the parent prop while overriding method is achieve
        System.out.print("this is child class");
    }
}
public class Main{
    public static void main(String[] args){
        child c=new child();
        c.parent();
    }
}
