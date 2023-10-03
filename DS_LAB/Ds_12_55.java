import java.util.Scanner;
public class Ds_12_55{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DbLIst c1 = new DbLIst();
        while (true) {
        System.out.println("Enter 1 to insert from front\n Enter 2 to insert from last\n Enter 3 to delete from specific index\n Enter 4 to display\n Enter -1 to end:");
        int c = sc.nextInt();
        if(c==1){
            System.out.println("enter value");
            int a = sc.nextInt();
            c1.insertF(a);
        }
        else if (c==2) {
            System.out.println("enter value");
            int a = sc.nextInt();
            c1.insertE(a);
        }
        else if (c==3){
            System.out.println("enter position");
            int a = sc.nextInt();
            Node d = c1.deleteI(a);
            if(d==null){
                System.out.println("");
            }
            else{
                System.out.println(d.info);
            }
        }
        else if (c==4) {
            c1.display();
        }
        else{
            break;
        }
       } 
    
    }
}
class Node{
    int info;
    Node Llink;
    Node Rlink;
    Node(int info){
        this.info = info;
    }
}
class DbLIst{
    Node first = null , last = null;
    void insertF(int value){
        if(first == null){
            first = new Node(value);
            last = first;
            first.Llink = null;
            last.Llink = null;
            first.Rlink = null;
            last.Rlink = null;
        }
        else{
            Node temp = new Node(value);
            temp.Llink = null;
            temp.Rlink = first;
            first.Llink = temp;
            first = temp;
        }
    }
    void insertE(int value){
        if(first == null){
            first = new Node(value);
            last = first;
            first.Llink = null;
            last.Llink = null;
            first.Rlink = null;
            last.Rlink = null;
        }
        else{
            Node temp = new Node(value);
            temp.Llink = last;
            temp.Rlink = null;
            last.Rlink = temp;
            last = temp;
        }
    }
    Node deleteI(int i){
        if(first == null){
            System.out.println("empty list");
            return null;
        }
        else if(first == last && i==1){
            Node temp = first;
            first = null;
            last = null;
            return temp;
        }
        else{
            int y=1;
            Node inc=first;
            while(inc!=last){
                y++;
                inc = inc.Rlink;
            }
            if(y>=i){
                Node temp = first;
                int j=1;
                while(j<i){
                    temp = temp.Rlink;
                    j++;
                }
                if(i==1){
                    first = first.Rlink;
                    first.Llink = null;
                }
                else if(temp == last){
                    last = last.Llink;
                    last.Rlink = null;
                }
                else{
                    temp.Llink.Rlink =temp.Rlink;
                    temp.Rlink.Llink =temp.Llink;
                }
                return temp;
            }
            else{
                System.out.println("invalide input");
                return null;
            }
        }
    }
    void display(){
        if(first == null){
            System.out.println("empty list");
            return;
        }
        Node temp = first;
        while(temp!=last){
            System.out.println(temp.info);
            temp = temp.Rlink;
        }
        System.out.println(last.info);
    }
}