import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        String y = sc.nextLine();
        String z = sc.nextLine();

        employee emp1=new employee();
        employee emp2=new employee();

        emp1.id=101;
        emp1.name="amit";
        emp1.designation="software engineer";

        emp2.id=201;
        emp2.name="roit";
        emp2.designation="data engineer";




        System.out.println(" old detailos of employee 1;");
        emp1.getemployeedetails(emp1.id,emp1.name,emp1.designation);
        emp1.id=x;
        emp1.name=y;
        emp1.designation=z;
        System.out.println(" New detailos of employee 1;");
        emp1.getemployeedetails(emp1.id,emp1.name,emp1.designation);
        System.out.println("detailos of employee 2;");
        emp2.getemployeedetails(emp2.id,emp2.name,emp2.designation);
    }
}
