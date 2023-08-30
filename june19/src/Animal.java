
class cow{
    cow()
    {

        System.out.print("cow cow cow");
    }
}
class dog extends cow{
    dog(int p)
    {
        super();
        System.out.print("dog is dog");
    }


}
public class Animal extends dog{
    Animal(int q) {
        super(q);
    }
}
