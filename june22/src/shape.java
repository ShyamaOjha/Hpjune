abstract class shape {
   abstract void area();
   abstract void volume();

}
class Circle extends shape{

    @Override
    void area() {
        System.out.println("Area of circle");
    }
    @Override
    void volume() {
        System.out.println("bhai please nhi hoga");
    }
}
class rectangle extends shape{
    int l,b,h;
    @Override
    void area() {
        System.out.println("area of rectangle");
    }

    @Override
    void volume() {
        System.out.println("volume of rectangle");
    }
}
