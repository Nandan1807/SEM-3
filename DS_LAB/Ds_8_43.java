import java.util.Scanner;
public class Ds_8_43{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit:");
        int n = sc.nextInt();
        int a[]= new int[n];
        Circular cr = new Circular();
        while(true){
            System.out.println("Enter 1 to insert ,Enter 2 to delete, Enter 3 to desplay, enter -1 to end");
            int c = sc.nextInt();
            if(c==1){
                System.out.println("Enter a element:");
                int y = sc.nextInt();
                cr.cqInsert(a,n,y);
            }
            else if(c==2){
                int d= cr.cqDelete(a,n);
                System.out.println(d);
            }
            else if(c==3){
                cr.display(a);
            }
            else{
                break;
            }
        }
        
    }
}

class Circular{
    int f=-1,r=-1;
    public void cqInsert(int a[],int n,int y){
        int x = r;
        r++;
        if(r>=n){
            r=0;
        }
        if(r==f){
            System.out.println("over flow");
            r=x;
            return;
        }
        a[r]=y;
        if(f==-1){
            f=0;
        }
        System.out.println(r);
    }

    public int cqDelete(int a[],int n){
        if(f==-1){
            System.out.println("underflow");
            return 0 ;
        }
        int y = a[f];
        if(f==r){
            f=-1;
            r=-1;
        }
        else if(f==(n-1)){
            f=0;
        }
        else{
            f++;
        }
        return y;
    } 
    
    public void display(int a[]){
        if(f==-1 && r==-1){
            System.out.println("Empty Queue");
            return;
        }
        int flag =0;
        for(int i = f ;i<a.length ;i++){
            System.out.print(a[i]+" ");
            if(i==r){
                flag++;
                break;
            }
        }
        if(flag==0){
            for(int i = 0 ;i<=r ;i++){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
    }
}