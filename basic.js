function dfs(graph, root) {
    const n = graph.length;
    const visited = new Array(n).fill(false);
    const stack = [];
    const result = [];

    // Start from the root
    stack.push(root);
    visited[root] = true;

    while (stack.length > 0) {
        const current = stack.pop();  // LIFO - Depth First
        result.push(current);

        // Explore neighbors in reverse order (optional but helps match common test expectations)
        for (let neighbor = n - 1; neighbor >= 0; neighbor--) {
            if (graph[current][neighbor] === 1 && !visited[neighbor]) {
                visited[neighbor] = true;
                stack.push(neighbor);
            }
        }
    }

    return result;
}
