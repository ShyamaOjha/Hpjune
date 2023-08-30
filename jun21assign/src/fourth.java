class G{
    void show()
    {
        System.out.println("this is g");
    }
}
class H extends G{
    void show(){
        super.show();
        System.out.println("this is h");
    }

}
class I extends H{
    void show(){
        super.show();
        System.out.println("this is i");
    }

}
class J extends I{
    void show(){
        super.show();
        System.out.println("this is j");
    }
}

