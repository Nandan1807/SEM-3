import java.util.Scanner;
public class Ds_4_1{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = 12;
        int b = 13;
        swap(a,b);
        
    }
    public static void swap(int a,int b) {
        System.out.println("Before Swap:"+a+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After Swap:"+a+b);
    }
}
