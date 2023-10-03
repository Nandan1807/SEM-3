import java.util.Scanner;
public class Ds_9_50{
    public static void main(String[] args) {
        Llist l = new Llist();
        while(true){
            System.out.println("Enter 1 for push,\n 2 for delete at front ,\n 3 for display ,\n -1 for end");
            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();
            if(c==1){
                System.out.println("Enter number:");
                int b = sc.nextInt();
                l.push(b);
            }
            else if(c==2){
                if (l.count<=0){
                    System.out.print("");    
                }
                else{
                    Node b =l.pop();
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
    void push(int value){
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
    Node pop(){
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
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.info);
            temp = temp.link;
        }
    }
}