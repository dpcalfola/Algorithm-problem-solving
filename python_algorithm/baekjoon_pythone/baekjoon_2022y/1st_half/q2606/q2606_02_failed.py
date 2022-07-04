import sys

num_of_vertex = int(sys.stdin.readline().rstrip())
num_of_edges = int(sys.stdin.readline().rstrip())

graph = [[0 for _ in range(num_of_vertex + 1)] for _ in range(num_of_vertex + 1)]

for _ in range(num_of_edges):
    read_line = list(map(int, sys.stdin.readline().split()))
    a = read_line[0]
    b = read_line[1]
    graph[a][b] = 1
    graph[b][a] = 1

# dfs start
# 스택에 한 개의 데이터는 있어야 제자리에 돌아왔을때
# 반복문이 끝나지 않고 한 번 더 확인함
stack = [-1]
visited = []
current = 1
stack.append(current)
visited.append(current)

while stack:
    next_ = None
    for vertex in range(1, num_of_vertex + 1):
        if graph[current][vertex] == 1:
            # print(f'current : {current}, vertex : {vertex}')
            # print(f'visited : {visited}')
            if vertex not in visited:
                next_ = vertex
                break

    if next_ is not None:
        current = next_
        stack.append(current)
        visited.append(current)
        # print(f'appended number : {current}')
    else:
        current = stack.pop()
        # print(f'pop : {current}')

    # print(f'length of stack : {len(stack)}')

# print(visited)
print(len(visited) - 1)
