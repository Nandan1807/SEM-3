import java.util.Scanner;
public class Ds_8_42{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit:");
        int n = sc.nextInt();
        int a[]= new int[n];
        int f=-1;
        int r=-1;
        System.out.println("Enter Element:");
        int y = sc.nextInt();
        enqueue(a,n,f,r,y);
        display(a);
        int ans = dequeue(a,f,r);
        System.out.println(ans);
        display(a);
    }

    static void enqueue(int a[],int n,int f,int r,int y){
        if(r==n-1){
            System.out.println("Overflow");
            return;
        }
        r++;
        a[r]=y;
        if(f==-1){
            f=0;
            System.out.println(f);
        }
    }


    static int dequeue(int a[],int f,int r){
        if(f==-1){
            System.out.println("Underflow");
            return 0;
        }
        int c = a[f];
        if(f==r){
            f=-1;
            r=-1;
        }
        else{
            f++;
        }
        return c;
    }

    static void display(int a[])
    {   
        for(int i=0; i<a.length;i++){
        System.out.println(a[i]);
        }
        
    }
}