import java.util.Scanner;
public class BinarySearch{
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
        int index=binarySearch(arr,k,0,n);
        if(index!=-1){
            System.out.println(k+" found at "+index);
        }
        else{
            System.out.println("not found ");
        }
    }

    static int binarySearch(int arr[],int k,int s,int n){
        if(arr[(s+n)/2]>k){
            return binarySearch(arr,k,s,(s+n)/2);
        }
        else if(arr[(s+n)/2]<k){
            return binarySearch(arr,k,(s+n)/2+1,n);
        }
        else if(arr[(s+n)/2]==k){
            return (s+n)/2;
        }
        return -1;
    }
}