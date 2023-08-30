class car{
    void tyre()
    {
        System.out.print("car having tyre");
    }
    void stering()
    {
        System.out.print("stering are there");
    }
}

class bike extends car{
    void tyre()
    {
        super.tyre();
        System.out.print("bike are having two tyre");
    }
    void handle()
    {
        System.out.println("bike having one handle");
    }
}

public class Mahindra extends bike{
    void display()
    {super.tyre();
        System.out.print("mahindra brand");
    }

    }

