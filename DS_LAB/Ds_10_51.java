import java.util.Scanner;
public class Ds_9_51{
    public static void main(String[] args) {
        Llist l = new Llist();
        while(true){
            System.out.println("Enter 1 for enque,\n 2 for deque,\n 3 for display ,\n -1 for end");
            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();
            if(c==1){
                System.out.println("Enter number:");
                int b = sc.nextInt();
                l.enque(b);
            }
            else if(c==2){
                if (l.count<=0){
                    System.out.println("Empty list");    
                }
                else{
                    Node b =l.deque();
                    System.out.println(b.info);
                }
            }
            else if(c==3){
                l.display();
            }
            else if(c==-1){
                break;
            }
            else{
                System.out.println("invalid input");
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
    void enque(int value){
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
    Node deque(){
        Node temp = head;
        if(temp.link == null){
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
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.info);
            temp = temp.link;
        }
    }
}