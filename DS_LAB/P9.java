import java.util.*;
public class P9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if((num/2)*2==num){
            System.out.print("number is even ");
        }else{
            System.out.print("number is odd ");
        }
    }
}