import java.util.*;
public class P11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=0,digit=0,temp=num;
        while(num!=0){
            digit=num%10;
            ans+=(digit*digit*digit);
            num=num/10;
        }
        if(temp==ans){
            System.out.print("number is armstrong");
        }else{
            System.out.print("number is not armstrong");
        }
    }
}