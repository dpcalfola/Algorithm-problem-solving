import sys

max_integer = -1
matrix = []
answer = ()

for _ in range(9):
    input_line = list(map(int, sys.stdin.readline().split()))
    matrix.append(input_line)

for i in range(9):
    for j in range(9):
        current = matrix[i][j]
        if current > max_integer:
            max_integer = current
            answer = (i, j)

print(max_integer)
print(answer[0] + 1, answer[1] + 1)
