import java.util.Scanner;
public class Ds_9_47{
    public static void main(String[] args) {
        Llist l = new Llist();
        while(true){
            System.out.println("Enter 1 for insert at front,\n 2 for insert at last,\n 3 for delete at front ,\n 4 for delete at last,\n 5 for delete at specified posiion,\n 6 for display ,\n -1 for end");
            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();   
            if(c==1){
                System.out.println("Enter number:");
                int b = sc.nextInt();
                l.insertF(b);
            }
            else if(c==2){
                System.out.println("Enter number:");
                int b = sc.nextInt();
                l.insertE(b);
            }
            else if(c==3){
                Node b =l.deleteF();
                System.out.println(b.info);
            }
            else if(c==4){
                Node b =l.deleteE();
                System.out.println(b.info);
            }
            else if(c==5){
                System.out.println("Enter position:");
                int b = sc.nextInt();
                if (l.count<b){
                    System.out.println("enter valid index");    
                }
                else{
                    Node d=l.deleteI(b);
                    System.out.println(d.info);
                }
            }
            else if(c==6){
                l.printList();
            }
            else if(c==-1){
                break;
            }
            else{
                System.out.println("invalide input");
            }
        } 
    }
}
class Node{
    int info;
    Node link;
    
    Node(int info){
        this.info = info;
    }
}
class Llist{
    Node head;
    int count;
    void insertE(int value){
        count++;
        if(head == null){
            head = new Node(value);
        }
        else{
            Node temp = head;
            while(temp.link!=null){
                temp = temp.link;
            } 
            temp.link= new Node(value);
        }
    }
    void insertF(int value){
        count++;
        if(head == null){
            head = new Node(value);
        }
        else{
            Node n = new Node(value);
            n.link = head;
            head = n;
        }
    }
    Node deleteF(){
        if(head == null){
            System.out.println("linked list is empty:");
            return null; 
        }
        else if(head.link == null){
            count--;
            Node x = head;
            head = null;
            return x;
        }
        else{
            count--;
            Node x = head;
            head = head.link;
            return x;
        }
    }
    Node deleteE(){
        Node temp = head;
        if(head == null){
            System.out.println("linked list is empty:"); 
            return head;
        }
        else if(temp.link == null){
            count--;
            Node x = head;
            head = null;
            return x;
        }
        else{
            count--;
            Node pre = head;
            while(temp.link!=null){
                pre=temp;
                temp = temp.link;
            }
            pre.link=null;
            return temp;
        }
    }
    Node deleteI(int i){
        count--;
        Node temp = head;
        Node pre = head;
        int j=1;
        while(j<=i){
            pre=temp;
            temp = temp.link;
            j++;
        }
        pre.link=temp.link;
        return temp;
    }
    void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.info);
            temp = temp.link;
        }
    }
}
