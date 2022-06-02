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

# a 부터 시작해서 b 를 찾을 떄까지 탐색
visited = [a]
step = [0]
is_find = [False]


def bfs(start):
    que = deque()
    que.append(start)
    while que:
        current = que.popleft()
        step[0] = step[0] + 1
        for vertex in graph[current]:
            if vertex == b:
                is_find[0] = True
                return
            if vertex not in visited:
                visited.append(vertex)
                que.append(vertex)
    return


bfs(a)
print(step[0]) if is_find[0] else print(-1)
