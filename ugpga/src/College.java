class College{
    static int id;
    String name;
    int contactno;

    Undergraduate ug;
    Postgraduate pg;

    public College(int id,String name,int contactno,Undergraduate ugt,Postgraduate pgt)
    {
        this.id=id;
        this.name=name;
        this.contactno=contactno;
        this.ug=ugt;
        this.pg=pgt;
    }
    public void display(int id,String name,int contactno)
    {
        System.out.println(123+"amit"+32423);
    }

}