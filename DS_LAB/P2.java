import java.util.*;
public class P2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        StringBuffer name1=new StringBuffer(name);

        if(name.compareTo(name1.reverse())){
            System.out.print("String is pelidrom ");
        }else{
            System.out.print("String is not pelidrom ");
        }
    }
}