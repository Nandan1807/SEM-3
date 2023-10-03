import java.util.*;
public class P4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans = factorial(num);
        System.out.print("factorial is : "+ans);
    }
    static int factorial (int num){
        if(num>0){
            return num * factorial(num-1);
        }
        else{
            return 1;
        }
    }
}

