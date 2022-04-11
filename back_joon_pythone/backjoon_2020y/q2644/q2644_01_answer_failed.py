import sys

sys.setrecursionlimit(3000000)

V = int(sys.stdin.readline().rstrip())
a, b = map(int, sys.stdin.readline().split())
E = int(sys.stdin.readline().rstrip())

graph = [[] for _ in range(V + 1)]

for _ in range(E):
    x, y = map(int, sys.stdin.readline().split())
    graph[x].append(y)
    graph[y].append(x)

# a 부터 시작해서 b 를 찾을 떄까지 탐색
visited = [a]
step = -1


def dfs(start):
    global step
    for vertex in graph[start]:
        if vertex == b:
            step = len(visited)
            return

        if vertex not in visited:
            visited.append(vertex)
            dfs(vertex)


dfs(a)
print(step)
