import java.util.Scanner;
public class Ds_2_6{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter number:");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a number within the array and another number to replace with:");
        int b = sc.nextInt();
        int c = sc.nextInt();

        for(int i=0; i<n; i++){
            if(a[i]==b){
                a[i]=c;
                System.out.println("index"+i);
            }
        }
        System.out.println("array : ");
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}