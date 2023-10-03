import java.util.Scanner;
public class Ds_2_4{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter number:");
            a[i]=sc.nextInt();
        }
        int min=a[0],ind=0;
        for(int i=0; i<n; i++){
            if(min>a[i]){
                min=a[i];
                ind=i;
            }
        }
        System.out.println(ind);
    }
}