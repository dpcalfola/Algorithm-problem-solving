import sys

num = int(sys.stdin.readline())
screen = (1, 0)


def button(t):
    memory = (t[1], t[0] + t[1])
    return memory


for _ in range(num):
    screen = button(screen)

print(*screen)
