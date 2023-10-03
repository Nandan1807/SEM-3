import java.io.*;
import java.util.Stack;
import java.util.Scanner;
public class Ds_5_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counta=0 , countb=0;
        System.out.println("enter String");
        String str = sc.nextLine();
        Stack<Character> Mylist = new Stack<Character>();
        for(int i=0 ;i<str.length();i++){
            Mylist.push(str.charAt(i));
            if(str.charAt(i)=='a'){
                counta++;
            }
        }
        for(int i=0 ;i<str.length();i++){
            char str2=Mylist.pop();
            if(str2=='b'){
                countb++;
            }
        }
        if(counta==countb){
            System.out.println("valide string");
        }
        else{
            System.out.println("Invalide string");
        }
    }
}