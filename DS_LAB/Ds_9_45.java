public class Ds_9_45{
    public static void main(String[] args) {
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        n1.initialize(10,n2);
        n2.initialize(20,n3);
        n3.initialize(30,null);
        n1.print();
        n2.print();
        n3.print();
    }
}
class Node{
    int info;
    Node link;
    void initialize(int info , Node link){
        this.info = info;
        this.link = link;
    }
    void print(){
        System.out.println(info+""+link);
    }
}