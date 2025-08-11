import java.util.ArrayList;
import java.util.Scanner;

public class graph_representation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int v = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println();
        while (true) {
            System.out.print("Enter vertex1: ");
            int v1 = sc.nextInt();
            System.out.print("Enter vertex2: ");
            int v2 = sc.nextInt();

            if (v1 < 1 || v1 > v || v2 < 1 || v2 > v) {
                System.out.println("Invalid vertex number. Try again.");
                continue;
            }

            adj.get(v1).add(v2);
            adj.get(v2).add(v1); // undirected graph

            System.out.print("Do you want to continue? (Y/N): ");
            char choice = sc.next().charAt(0);
            if (choice == 'N' || choice == 'n') {
                break;
            }
        }

        System.out.println("\nAdjacency List:");
        for (int i = 1; i <= v; i++) {
            System.out.print("vertex " + i + " {");
            ArrayList<Integer> list = adj.get(i);
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j));
                if (j != list.size() - 1) System.out.print(", ");
            }
            System.out.println("}");
        }

        sc.close();
    }
}
