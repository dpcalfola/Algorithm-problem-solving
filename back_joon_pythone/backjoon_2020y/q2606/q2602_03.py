import sys

V = int(sys.stdin.readline().rstrip())
E = int(sys.stdin.readline().rstrip())

graph = [[] for _ in range(V + 1)]

for _ in range(E):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)

# print(graph)
# graph[] index = vertex
# graph[] elements = connected vertex


stack = [1]
visited = [1]

while stack:
    current = stack.pop()
    for vertex in graph[current]:
        if vertex not in visited:
            visited.append(vertex)
            stack.append(vertex)

# print(visited)
print(len(visited)-1)