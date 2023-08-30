public class setorget {
    private int x,y,z;
    void setx(int x)
    {
    this.x=x;
    }
    void sety(int y)
    {
        this.y=y;
    }
    void setz(int z)
    {
        this.z=z;
    }

    int getx()
    {
        return x;
    }
    int gety()
    {
        return y;
    }
    int getz()
    {
        return z;
    }

    void display(){
        System.out.print(x+y+z);
    }
}
