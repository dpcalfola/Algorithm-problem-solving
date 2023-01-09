import sys
from collections import deque

V, E = map(int, sys.stdin.readline().split())

graph = [[] for _ in range(V + 1)]

for _ in range(E):
    x, y = map(int, sys.stdin.readline().split())
    graph[x].append(y)
    graph[y].append(x)

print(graph)
cows = {c for c in range(1, V + 1)}


def bfs(start):
    que = deque()
    que.append(start)
    visited = set()
    visited.add(start)

    while que:
        current = que.popleft()
        for node in graph[current]:
            if node not in visited:
                visited.add(node)
                que.append(node)

    return visited


connected_cows = bfs(1)
print(cows)
print(connected_cows)

answer = cows.difference(connected_cows)

print(answer)
answer_list = list(answer)
answer_list.sort()
print(answer_list)

if not answer_list:
    print(0)
else:
    for i in answer_list:
        print(i)
