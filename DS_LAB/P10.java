// WAP to find a prime number between range (range should be entered by user).
import java.util.*;
public class P10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int st=sc.nextInt();
        int end=sc.nextInt();
        int count=0;
        for(int i=st;i<=end;i++){
            for(int j=2;j<=end;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.print(i);
            }
        }
    }
}