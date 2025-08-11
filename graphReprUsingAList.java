import java.util.*;

class pair {
    int vertex, weight;

    pair(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }
}

public class graphReprUsingAList {
    public static void main(String[] args) {
        int n = 3, m = 3;
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();

        // Initialize n+1 empty lists for 1-based indexing
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<pair>());
        }

        // edge 1---2
        adj.get(1).add(new pair(2,6));
        adj.get(2).add(new pair(1, 6));

        // edge 2---3
        adj.get(2).add(new pair(3, 5));
        adj.get(3).add(new pair(2, 5));

        // edge 1---3
        adj.get(1).add(new pair(3, 7));
        adj.get(3).add(new pair(1, 7));

        // print adjacency list
        for (int i = 1; i <= n; i++) {
            System.out.print("Vertex " + i + ": ");
            for (pair p : adj.get(i)) {
                System.out.print("(" + p.vertex + ", weight: " + p.weight + ") ");
            }
            System.out.println();
        }
    }
}
