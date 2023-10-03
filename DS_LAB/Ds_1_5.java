import java.util.Scanner;
public class Ds_1_5{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println(fact(a));
    }
    public static int fact(int a) {
        if(a>0){
            return a * fact(a-1);
        }
        else{
            return 1;
        }
    }
}
