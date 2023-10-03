import java.util.Scanner;
public class SelectionSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Element:");
            arr[i] = sc.nextInt();
        }
        System.out.println("sorted array:");
        int ans[]=selectionSort(arr,n);
        for(int i=0;i<n;i++){
            System.out.println(ans[i]+",");
        }
    }

    static int[] selectionSort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            boolean changed = false;
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                    changed = true;
                }
            }
            if(!changed){
                break;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}