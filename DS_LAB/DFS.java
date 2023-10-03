import java.util.*;
public class DFS{
    static Map<Integer, List<Integer>> edgeList = new HashMap<>();
    static Stack<Integer> stk = new Stack<>();
    static Map<Integer,Boolean> visitedDFS = new HashMap<>();
    static void addEdges(int a , int b, boolean direction){
        if(edgeList.containsKey(a)==false){
            edgeList.put(a,new ArrayList<>());
        }
        edgeList.get(a).add(b);

        if(direction==false){//undirected
            if(edgeList.containsKey(b)==false){
                edgeList.put(b,new ArrayList<>());
            }
            edgeList.get(b).add(a);
        }
    }
    static void dfs(int src){
        stk.push(src);
        while(!stk.isEmpty()){
            int temp = stk.pop();
            visitedDFS.put(temp,true);
            System.out.print(temp+" ");
            
            for(int elements: edgeList.get(temp)){
                if(!visitedDFS.getOrDefault(elements,false) && !stk.contains(elements)){
                    stk.push(elements);
                }
            }
        }
    }

    public static void main(String[] args) {
        // addEdges(0,1,false);
        // addEdges(1,6,false);
        // addEdges(1,4,false);
        // addEdges(4,5,false);
        // addEdges(4,3,false);
        // addEdges(3,2,false);
        // addEdges(3,7,false);

        addEdges(0,1,false);
        addEdges(0,4,false);
        addEdges(0,6,false);
        addEdges(1,2,false);
        addEdges(2,3,false);
        addEdges(4,2,false);
        addEdges(4,5,false);
        addEdges(6,5,false);

        System.out.print("DFS :");
        dfs(0);
    }
}