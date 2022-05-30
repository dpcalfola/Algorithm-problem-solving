import sys

V, E = map(int, sys.stdin.readline().split())

# Make graph
graph = [[] for _ in range(V + 1)]
for _ in range(E):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)


# Vertex array
vertex_arr = list(range(1, V + 1))
component = 0

# dfs
while vertex_arr:
    start_vertex = vertex_arr.pop()
    stack = [start_vertex]
    visited = [start_vertex]

    while stack:
        current = stack.pop()
        for vertex in graph[current]:
            if vertex not in visited:
                visited.append(vertex)
                stack.append(vertex)
                if vertex in vertex_arr:    # 방문한 정점은 dfs 시작 정점으로 사용하지 않음
                    vertex_arr.remove(vertex)
    component += 1

print(component)
