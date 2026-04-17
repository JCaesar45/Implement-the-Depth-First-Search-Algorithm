import java.util.*;

public class DFS {
    public static List<Integer> dfs(int[][] graph, int root) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        Deque<Integer> stack = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        stack.push(root);
        visited[root] = true;

        while (!stack.isEmpty()) {
            int current = stack.pop();     // LIFO - Depth First
            result.add(current);

            // Explore neighbors in reverse order
            for (int neighbor = n - 1; neighbor >= 0; neighbor--) {
                if (graph[current][neighbor] == 1 && !visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }

        return result;
    }
}
