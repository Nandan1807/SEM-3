import java.util.Scanner;
public class Ds_2_3{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit:");
        int n = sc.nextInt();
        int sum=0;
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter number:");
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            sum += i;
        }
        Double avg = (double)sum/n;
        System.out.println("Avg : "+avg);
    }
}

        