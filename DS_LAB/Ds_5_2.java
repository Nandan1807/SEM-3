import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Ds_5_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit");
        int n = sc.nextInt();
        int top =0;
        System.out.println("enter Array");
        char str[] = new char[n];
        for(int k=0 ; k<n; k++){
            str[k] = sc.next().charAt(0);
        }
        ArrayList<Character> Mylist = new ArrayList<Character>();
        int i ;
        for( i=0 ; i<n ;i++){
            if(str[i]=='c'){
                top=i-1;
                break;
            }
            else{
                Mylist.add(str[i]);
            }  
        }
        int j ;
        for(j=i+1; j<n ;j++){
            int ans=Mylist.get(top);
            top--;
            if(ans!=str[j]){
                System.out.println("Invalide string");
                return;
            }
            if(Mylist.isEmpty()){
                System.out.println("Invalide string");
                return;
            }
        }
        System.out.println("valide string");
    }
}