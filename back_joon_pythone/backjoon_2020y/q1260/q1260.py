import sys
from collections import deque

V, E, start = map(int, sys.stdin.readline().split())

graph = [[] for _ in range(V + 1)]

for _ in range(E):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)

# 그래프 간선 순서 정렬 ( 작은 숫자를 먼저 방문 하도록 )
for vertex in graph:
    vertex.sort()

print(graph)
visited_dfs = [start]
visited_bfs = [start]


def dfs(dfs_start):
    for vertex in graph[dfs_start]:
        if vertex not in visited_dfs:
            visited_dfs.append(vertex)
            dfs(vertex)


def bfs(bfs_start):
    que = deque()
    que.append(bfs_start)
    while que:
        current = que.popleft()
        for vertex in graph[current]:
            if vertex not in visited_bfs:
                visited_bfs.append(vertex)
                que.append(vertex)


dfs(start)
bfs(start)
print(visited_dfs)
print(visited_bfs)
