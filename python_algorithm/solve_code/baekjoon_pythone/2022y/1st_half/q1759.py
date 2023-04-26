import sys

L, C = map(int, sys.stdin.readline().split())
chars = list(map(str, sys.stdin.readline().split()))

chars.sort()
stack = []
vowel = {"a", "e", "i", "o", "u"}


def dfs():
    if len(stack) == L:
        stack_set = set(stack)
        temp = stack_set - vowel  # temp == number of consonant
        if 1 < len(temp) < L:
            print("".join(stack))
        return

    if len(stack) == 0:
        for i in chars:
            stack.append(i)
            dfs()
            stack.pop()
        return

    for i in chars:
        if i > stack[-1]:
            stack.append(i)
            dfs()
            stack.pop()


dfs()
