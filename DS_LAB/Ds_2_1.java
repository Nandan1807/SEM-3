import java.util.Scanner;
public class Ds_2_1{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter number:");
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}