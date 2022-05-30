import sys

K = int(sys.stdin.readline().rstrip())
stack = []

for _ in range(K):
    node = int(sys.stdin.readline().rstrip())

    if node == 0:
        stack.pop()
    else:
        stack.append(node)

print(sum(stack))
