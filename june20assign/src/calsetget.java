public class calsetget {
        private int x,y;
        void setx(int x)
        {
            this.x=x;
        }
        void sety(int y)
        {
            this.y=y;
        }
        int getx()
        {
            return x;
        }
        int gety()
        {
            return y;
        }
        void mul()
        {
            System.out.print("total = "+(x*y));
        }
        void add()
        {
            System.out.print("total = "+(x+y));
        }
        void divi()
        {
            System.out.print("total = "+(x/y));
        }
        void sub()
        {
            System.out.print("total = "+(x-y));
        }
        void mod()
        {
            System.out.print("total = "+(x%y));
        }
}
