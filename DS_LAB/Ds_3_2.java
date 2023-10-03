import java.util.Scanner;
public class Ds_3_2{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter number:");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a index:");
        int c = sc.nextInt();
        for(int i=c; i<n-1 ; i++){
            a[i]=a[i+1];
        }
        a[n-1]=0;
        System.out.println("New Array:");
        for(int i=0; i<n ; i++){
            System.out.println(a[i]);
        }
        System.out.println("0 shows empty index");
    }
}