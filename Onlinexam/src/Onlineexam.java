public class Onlineexam {
    int userid;
    String username;
    String loginID;
    String password;

    public Onlineexam(int idd , String names)
    {
      userid = idd;
     username = names;
    }
    public void signUp(String loginids,String Passwords,Onlineexam obj)
    {
        obj.loginID = loginids;
        obj.password = Passwords;
    }
    public void testC(){
        System.out.println("welocme to c online test");
    }
    public void testJava(){
        System.out.println("welcome to java online test");
    }
}

