def dfs(graph, root):
    n = len(graph)
    visited = [False] * n
    stack = []
    result = []

    stack.append(root)
    visited[root] = True

    while stack:
        current = stack.pop()      # LIFO - Depth First
        result.append(current)

        # Explore neighbors in reverse order to match typical test output order
        for neighbor in range(n - 1, -1, -1):
            if graph[current][neighbor] == 1 and not visited[neighbor]:
                visited[neighbor] = True
                stack.append(neighbor)

    return result
