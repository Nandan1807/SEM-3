public class Ds_9_46{
    public static void main(String[] args) {
        Llist l = new Llist();
        l.insert(10);
        l.insert(1);
        l.insert(0);
        l.insert(11);
        l.print();
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
    void insert(int value){
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
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.info);
            temp = temp.link;
        }
    }
}
