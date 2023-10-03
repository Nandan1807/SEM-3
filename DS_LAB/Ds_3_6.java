import java.util.Scanner;
public class Ds_3_6{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];

        System.out.println("Enter elemnts for a Matrix:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter elemnts for b Matrix:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                b[i][j]=sc.nextInt();
                c[i][j]= a[i][j]+b[i][j];
            }
        }

        System.out.println("Sum of matrices:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                if(j==0){
                    System.out.print("|"+c[i][j]+"  "); 
                }
                if(j==1){
                    System.out.print(c[i][j]+"|"); 
                }
            }
            System.out.print("\n");
        }
    }
}