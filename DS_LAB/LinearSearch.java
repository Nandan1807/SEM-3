import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Element:");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Element to search:");
        int k = sc.nextInt();
        linearSearch(arr,k,n);
    }

    static void linearSearch(int arr[],int k,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                System.out.println(k+" Found at "+i);
                return;
            }
        }
        System.out.println("not found");
    }
}