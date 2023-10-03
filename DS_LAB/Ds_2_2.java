import java.util.Scanner;
public class Ds_2_2{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Starting and ending point:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum=0;
        for(int i=m; i<=n; i++){
            sum += i;
        }
        System.out.println("sum : "+sum);
    }
}