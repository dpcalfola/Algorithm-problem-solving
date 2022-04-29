import sys

M = int(sys.stdin.readline().rstrip())
cups = ['0', '*', 'j', 'k']

for _ in range(M):
    a, b = map(int, sys.stdin.readline().split())
    cups[a], cups[b] = cups[b], cups[a]

print(cups.index('*'))
