import sys


class Graph:
    def __init__(self, size):
        self.SIZE = size + 1
        self.graph = [[0 for _ in range(self.SIZE)] for _ in range(self.SIZE)]

    def print_graph(self):
        for row in self.graph:
            print(row)


num_of_vertexes = int(sys.stdin.readline())
num_of_edges = int(sys.stdin.readline())

g1 = Graph(num_of_vertexes)

for _ in range(num_of_edges):
    read_line = list(map(int, sys.stdin.readline().split()))
    a = read_line[0]
    b = read_line[1]
    g1.graph[a][b] = 1
    g1.graph[b][a] = 1

g1.print_graph()

# dfs start
# 스택에 한 개의 데이터는 있어야 제자리에 돌아왔을때
# 반복문이 끝나지 않고 한 번 더 확인함
stack = [-1]
visited = []
current = 1
stack.append(current)
visited.append(current)

while len(stack) > 0:
    next_ = None
    for vertex in range(1, g1.SIZE):
        if g1.graph[current][vertex] == 1:
            print(f"current : {current}, vertex : {vertex}")
            print(f"visited : {visited}")
            if vertex not in visited:
                next_ = vertex
                break

    if next_ is not None:
        current = next_
        stack.append(current)
        visited.append(current)
        print(f"appended number : {current}")
    else:
        current = stack.pop()
        print(f"pop : {current}")

    print(f"length of stack : {len(stack)}")

print(visited)
print(len(visited) - 1)
