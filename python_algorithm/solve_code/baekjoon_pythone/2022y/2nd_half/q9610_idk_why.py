import sys

t: int = int(sys.stdin.readline().rstrip())

coordinate_list: list = []

for _ in range(t):
    x, y = map(int, sys.stdin.readline().split())
    coordinate_list.append((x, y))

# count
q_1 = 0
q_2 = 0
q_3 = 0
q_4 = 0
axis = 0

for q in coordinate_list:
    x, y = q[0], q[1]

    if x == 0 or x == 0:
        axis += 1
    if x > 0 and y > 0:
        q_1 += 1
    if x < 0 and y > 0:
        q_2 += 1
    if x < 0 and y < 0:
        q_3 += 1
    if x > 0 and y < 0:
        q_4 += 1

print(f'Q1: {q_1}')
print(f'Q2: {q_2}')
print(f'Q3: {q_3}')
print(f'Q4: {q_4}')
print(f'AXIS: {axis}', end='')
