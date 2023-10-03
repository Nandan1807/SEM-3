import java.util.Scanner;
import java.util.Stack;
public class Ds_6_31{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter infix expression:");
        String str = sc.nextLine();
        
        String St2 = check(str);
        int ans = rank(St2);
        System.out.println("Postfix Expression:"+St2);
        System.out.println("rank:"+ans);
    }
    static int precedance(char n){
        if(n=='+' || n=='-'){
            return 1;
        }
        else if(n=='*'||n=='/'){
            return 2;
        }
        else if(n=='^'){
            return 3;
        }
        else{
            return -1;
        }
    }
    static String check(String str){
        Stack<Character> st1 = new Stack<>();
        char temp;
        String postfix = "";
        for(int i=0 ; i<str.length() ; i++){
            char n = str.charAt(i);
            if(Character.isLetterOrDigit(n)){
                postfix = postfix + n;
            }
            else{
                if(n=='('){
                    st1.push(n);
                }
                else if(n==')'){
                    temp = st1.pop();
                    while(!st1.isEmpty() && temp!='('){
                        postfix = postfix + temp;
                        temp = st1.pop();
                    }
                }
                else if(!st1.isEmpty() && (st1.peek()=='^' && n=='^')){
                    st1.push(n);
                }
                else{
                    while(!st1.isEmpty() && precedance(n) <= precedance(st1.peek())){
                        temp = st1.pop();
                        postfix = postfix + temp;
                    }
                    st1.push(n);
                }
            }
        }
        return postfix;
    }
    static int rank(String p){
        int sum=0;
        for(int i=0; i<p.length();i++){
            char n = p.charAt(i);
            if(Character.isLetterOrDigit(n)){
                sum += 1;
            }
            else{
                sum -= 1;
            }
        }
        return sum ;
    }
}