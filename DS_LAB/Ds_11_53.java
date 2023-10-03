import java.util.Scanner;

public class Ds_11_53 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       CrQueue c1 = new CrQueue();
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

class Node {
    int info;
    Node link;
    Node(int info){
        this.info=info;
    }
}

class CrQueue {
    Node first=null,last=null;
    void insertF(int value){
        if(first == null){
            first =new Node(value);
            last = first;
            first.link = first;
            last.link = first;
        }
        else{
            Node temp = first;
            first =new Node(value);
            first.link = temp;
            last.link = first;
        }
    }
    void insertE(int value){
        if(first == null){
            first =new Node(value);
            last = first;
            first.link = first;
            last.link = first;
        }
        else{
            Node temp = last;
            last =new Node(value);
            temp.link = last;
            last.link = first;
        }
    }
    Node deleteI(int i){
        if(first == null){
            System.out.println("empty list");
            return null;
        }
        else if(first == last && i ==1){
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
                inc = inc.link;
            }
            if(y>=i){
                Node temp = first;
                Node pred = first;
                int j=1;
                while(j<i){
                    pred = temp ;
                    temp = temp.link;
                    j++;
                }
                pred.link = temp.link;
                if(i==1){
                    first = first.link;
                    last.link = first;
                }
                if(temp == last){
                    last = pred;
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
            temp = temp.link;
        }
        System.out.println(last.info);
    }
}