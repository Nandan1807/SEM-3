import java.util.Scanner;
public class Ds_2_5{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter number:");
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]==a[j]){
                    System.out.println("Duplicate Found at : "+i+"and"+j);  
                    return;
                }
            }
        }
        System.out.println("no Duplicate Found");
    }
}