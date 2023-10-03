import java.util.*;
public class P5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=0;
        ans=sum(num);
        System.out.println("sum of digit is : "+ans);
    }
    static int sum(int num){
        if(num>0){
            return (num%10)+sum(num/10);
        }
        else{
            return 0;
        }
    }
}