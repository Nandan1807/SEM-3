import java.util.Scanner;
public class Ds_4_2{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Employee_Detail E1 = new Employee_Detail();
        System.out.println("Enter Id ,Name ,Salary ,Designation :");
        E1.Employee_ID = sc.nextInt();
        E1.Employee_Name = sc.next();
        // sc.nextLine();
        E1.Employee_Salary = sc.nextInt();
        // sc.nextLine();
        E1.Employee_Designation = sc.next();
        E1.print();
    }
}
class Employee_Detail{
    int Employee_ID,Employee_Salary;
    String Employee_Name, Employee_Designation;

    public void print(){
        System.out.println("Id:"+Employee_ID+"  Name:"+Employee_Name+"  Salary:"+Employee_Salary+"  Designation:"+Employee_Designation);
    }
}





























