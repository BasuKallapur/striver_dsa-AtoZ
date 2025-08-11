import java.util.Scanner;

public class grapshsss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of vertices and edges
        int n = 3, m = 3; // or read from input: sc.nextInt(), sc.nextInt()

        int[][] adj = new int[n + 1][n + 1]; // 1-based indexing

        // Take m edges as input and fill the adjacency matrix
        for (int i = 0; i < m; i++) {
            System.out.print("Enter edge " + (i + 1) + " (u v): ");
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj[u][v] = 1;
            adj[v][u] = 1; // since undirected
        }

        // Print the adjacency matrix
        System.out.println("\nAdjacency Matrix:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
