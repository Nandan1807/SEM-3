import java.util.*;
public class P1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];

        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<5;i++){
            if(arr[i]%2==0){
                sum=sum+arr[i];
            }
        }
        System.out.print("sum is : "+sum);
        

    }
}