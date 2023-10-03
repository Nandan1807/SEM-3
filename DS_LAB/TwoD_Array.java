import java.util.Scanner;
public class TwoD_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertex:");
        int n = sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter Matrix:");
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.println("Enter number:");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                if(j==0){
                    System.out.print(" | "+arr[i][j]+" ");
                }
                else if(j==n-1){
                    System.out.print(arr[i][j]+" | ");
                }
                else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}