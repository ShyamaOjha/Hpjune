public class Trafficlight {
    String light;
    void light(String light)
    {
        this.light=light;
    }
    void displayTraffic(){
        System.out.println("please follow traffic light..be a good citizen");
    }
}
class Red extends Trafficlight{
    void displayred(String light)
    { super.displayTraffic();
        System.out.println("red is light,stop !!");
    }
}
class Yellow extends Red{
    void displayyellow(String light)
    { super.displayTraffic();
        System.out.println("ywellow is light,be readu for go!!");
    }
}
class Green extends Yellow{
    void displaygreen(String light)
    { super.displayTraffic();
        System.out.println("green light,you can go,happy journey");
    }
}