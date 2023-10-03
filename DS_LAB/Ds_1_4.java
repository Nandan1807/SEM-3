import java.util.Scanner;
public class Ds_1_4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int ans=1;
        for(int i=1;i<=a;i++){
            ans *= i;
        }
        System.out.println("Factorial : "+ans);
    }
}
