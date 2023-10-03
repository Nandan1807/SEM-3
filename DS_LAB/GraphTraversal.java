import java.util.*;
class GraphTraversal{
    static Map<Integer, List<Integer>> edgeList = new HashMap<>();
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

    static void bfs(int src){
        Queue<Integer> tempQ = new LinkedList<>();
        Map<Integer,Boolean> visitedBFS = new HashMap<>();

        tempQ.add(src);
        visitedBFS.put(src,true);
        

        while(tempQ.isEmpty()==false){
            int temp = tempQ.poll();
            System.out.print(temp+",");
            for(int elements : edgeList.get(temp)){
                if(!visitedBFS.getOrDefault(elements,false)){
                    visitedBFS.put(elements,true);
                    tempQ.add(elements);
                }
            }
        }

    }

    static void dfs(int src){
        visitedDFS.put(src,true);
        System.out.print(src+",");
        for(int elements : edgeList.getOrDefault(src,new ArrayList<>())){
            if(!visitedDFS.getOrDefault(elements,false)){
               dfs(elements);
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

        System.out.print("BFS :");
        bfs(0);
        System.out.print("\nDFS :");
        dfs(0);
    }
}