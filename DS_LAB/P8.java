import java.util.*;
public class P8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0,digit=0,ceven=0,codd=0;
        while(num!=0){
            digit=num%10;
            if(digit%2==0){
                ceven=ceven+1;
            }else{
                codd++;
            }
            num/=10;
        }
        System.out.print("count of even is : "+ceven+" count odd is : "+codd);
    }
}