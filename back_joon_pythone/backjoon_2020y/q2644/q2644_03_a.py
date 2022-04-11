import sys
from collections import deque

V = int(sys.stdin.readline().rstrip())
a, b = map(int, sys.stdin.readline().split())
E = int(sys.stdin.readline().rstrip())

graph = [[] for _ in range(V + 1)]

for _ in range(E):
    x, y = map(int, sys.stdin.readline().split())
    graph[x].append(y)
    graph[y].append(x)

print(graph)
visited = []
result = []


def bfs(start):
    count = 0
    visited.append(start)
    result.append([start, count])
    que = deque()
    que.append([start, count])

    while que:
        vo = que.popleft()
        current = vo[0]
        step = vo[1]
        step += 1
        for node in graph[current]:
            if node == b:
                return step
            if node not in visited:
                visited.append(node)
                result.append([node, step])
                que.append([node, step])
    return -1


answer = bfs(a)

print(visited)
print(result)

print(answer)
