import java.util.Scanner;
public class Pattern{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        int a = 0;
        for(int i=n;i>0;i--){
            a = a+ i;
        }
        int temp = 0;
        int v = 1;
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){

                arr[temp][i] = a;
                a--;
                if(v==1){
                    temp++;
                }
                else{
                    temp--;
                }
            }
            if(v==1){
                temp--;
                v=0;
            }
            else{
                temp=temp+2;
                v=1;
            }
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){
                if(a<10){
                    System.out.print(arr[i][j]+"   ");
                }else{
                    System.out.print(arr[i][j]+"  ");
                }
                
            }
            System.out.println();
        }
    }
}