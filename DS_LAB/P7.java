import java.util.*;
public class P7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0,b=1,k=1;
        int sum=0;
        while(k<=num){
            System.out.print(a+"");
            System.out.print(b);
            a=a+b;
            b=b+a;
            k+=2;
        }
    }
}  