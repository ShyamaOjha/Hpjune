

class X{
    void dispaly()
    {
        System.out.println("parent class");
    }
}
class Y extends X{
    void displayY(){
        super.dispaly();
        System.out.println("child class y");
    }
}
class Z extends X{
    void displayZ(){
        super.dispaly();
        System.out.println("this is C");
    }

}
