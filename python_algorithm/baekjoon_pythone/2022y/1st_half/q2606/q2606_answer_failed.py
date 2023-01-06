import sys


class Graph:
    def __init__(self, size):
        self.SIZE = size + 1
        self.graph = [[0 for _ in range(self.SIZE)] for _ in range(self.SIZE)]


num_of_vertexes = int(sys.stdin.readline())
num_of_edges = int(sys.stdin.readline())

g1 = Graph(num_of_vertexes)

for _ in range(num_of_edges):
    read_line = list(map(int, sys.stdin.readline().split()))
    a = read_line[0]
    b = read_line[1]
    g1.graph[a][b] = 1
    g1.graph[b][a] = 1

# dfs start
stack = [-1]
visited = []
current = 1
stack.append(current)
visited.append(current)

while len(stack) > 0:
    next_ = None
    for vertex in range(1, g1.SIZE):
        if g1.graph[current][vertex] == 1:
            if vertex not in visited:
                next_ = vertex
                break

    if next_ is not None:
        current = next_
        stack.append(current)
        visited.append(current)
    else:
        current = stack.pop()

print(len(visited) - 1)
