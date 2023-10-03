import java.util.Scanner;
public class Ds_13_59{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree c1 = new BinaryTree();
        while (true) {
        System.out.println("Enter 1 to insert\n Enter 2 to preorder\n Enter 3 to inorder\n Enter 4 to postorder\n Enter 5 to delete\n Enter -1 to end:");
        int c = sc.nextInt();
        if(c==1){
            while (true) {
                System.out.println("enter value");
                int a = sc.nextInt();
                if(a==-1){
                    break;
                }
                c1.insert(a);
            }
            
        }
        else if(c==2){
            c1.preorder(c1.root);
        }
        else if(c==3){
            c1.inorder(c1.root);
        }
        else if(c==4){
            c1.postorder(c1.root);
        }
        else if(c==5){
            System.out.println("enter value");
            int a = sc.nextInt();
            Node d = c1.delete(a);
            if(d!=null){
                System.out.println(d.info);
            }
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
class BinaryTree{
    Node root;
    void insert(int value){
        if(root == null){
            root = new Node(value);
            root.Llink = null;
            root.Rlink = null;
        }
        else{
            Node temp = new Node(value);
            temp.Rlink=null;
            temp.Llink=null;
            Node c=root;
            if(temp.info>c.info){
                while(c.Rlink != null){
                    if(temp.info>c.info){
                        c = c.Rlink;
                    }
                    else if(temp.info < c.info){
                        if(c.Llink==null){
                            break;
                        }
                        c = c.Llink;
                    }
                } 
            }
            else{
                while(c.Llink != null){
                    if(temp.info>c.info){
                        if(c.Rlink==null){
                            break;
                        }
                        c = c.Rlink;
                    }
                    else if(temp.info<c.info){
                        c = c.Llink;
                    }
                }
            }
            if(temp.info!=c.info){
                if(c==root){
                    if(temp.info>c.info){
                        root.Rlink =temp;
                    }
                    else{
                        root.Llink =temp;
                    }
                }
                else{
                    if(temp.info>c.info){
                        c.Rlink =temp;
                    }
                    else{
                        c.Llink =temp;
                    }
                }
            }
        }
    }
    Node delete(int value){
        if(root == null){
            System.out.println("Empty Tree.");
            return null;
        }
        else if(value==root.info){
            Node save=root;
            if(root.Rlink==null && root.Llink==null){
                root=null;
            }
            else if (root.Rlink!=null && root.Llink==null) {
                root=root.Rlink;
            }
            else if (root.Rlink==null && root.Llink!=null) {
                root=root.Llink;
            }
            else{
                Node temp=root.Rlink;
                while(temp.Llink!=null){
                    temp=temp.Llink;
                }
                temp.Llink=root.Llink;
                root=root.Rlink;
            }
            return save;
        }
        else{
            Node c=root;
            Node pre = null;
            try {
                while((c.Rlink!=null && c.Llink!=null) || (c.Rlink==null && c.Llink!=null) || (c.Rlink!=null && c.Llink==null)){
                   if(value>c.info){
                        pre = c;
                        c = c.Rlink;
                    }
                    else if(value<c.info){
                        pre = c;
                        c = c.Llink;
                    }
                    else{
                        break;
                    }
                }
                if(c.Rlink==null && c.Llink==null){
                    if(pre.info>c.info){
                        pre.Llink=null;
                    }
                    else{
                        pre.Rlink=null;
                    }
                    return c;
                } 
                else{
                    if(c.Llink==null && c.Rlink!=null){
                        if(c.info < pre.info){
                            pre.Llink = c.Rlink; 
                        }
                        else{
                            pre.Rlink = c.Rlink;
                        }
                    }
                    else if(c.Llink!=null && c.Rlink==null){
                        if(c.info < pre.info){
                            pre.Llink = c.Llink;
                        }
                        else{
                            pre.Rlink = c.Llink;
                        }
                    }
                    else{
                        Node temp=c.Rlink;
                        while(temp.Llink!=null){
                            temp=temp.Llink;
                        }
                        temp.Llink=c.Llink;
                        if(pre.info<c.info){
                            pre.Rlink=c.Rlink;
                        }
                        else{
                            pre.Llink=c.Rlink;
                        }
                    }
                    return c;
                }
            } catch (Exception e) {
                System.out.println("invalid input.");
                return null;
            }
        }
    }
    void preorder(Node point){
        if(point == null){
            return;
        }
        System.out.println(point.info);
        preorder(point.Llink);
        preorder(point.Rlink);
    }
    void inorder(Node point){
        if(point == null){
            return;
        }
        inorder(point.Llink);
        System.out.println(point.info);
        inorder(point.Rlink);
    }
    void postorder(Node point){
        if(point == null){
            return;
        }
        postorder(point.Llink);
        postorder(point.Rlink);
        System.out.println(point.info);
    }
}