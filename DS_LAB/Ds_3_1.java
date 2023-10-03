import java.util.Scanner;
public class Ds_3_1{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit:");
        int n = sc.nextInt();
        int a[] = new int[n+1];
        for(int i=0; i<n; i++){
            System.out.println("enter number:");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a number and index:");
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp = 0;
        for(int i=c; i<n+1; i++){
            temp = a[i];
            a[i]= b;
            b= temp;
        }
        System.out.println("New Array:");
        for(int i=0; i<n+1; i++){
            System.out.println(a[i]);
        }
    }
}