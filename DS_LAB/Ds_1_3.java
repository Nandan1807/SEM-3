import java.util.Scanner;
public class Ds_1_3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character:");
        char c = sc.nextLine().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonent");
        }
    }
}