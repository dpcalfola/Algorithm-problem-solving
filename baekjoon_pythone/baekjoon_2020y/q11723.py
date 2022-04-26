# 백준 11723번 집합

# Point !!
#
#   존재하지 않는 요소를 remove 하려고 하면 KeyError 발생한다.
#       1. 존재 여부를 확인 후 remove
#       2. .dicard 함수 사용 ( Remove an element from a set if it is a member.
#                           If the element is not a member, do nothing )
#
#   집합 모든 원소 제거 -> set_a.clear

import sys

S = set()

M = int(sys.stdin.readline().rstrip())

for _ in range(M):
    input_line = list(sys.stdin.readline().split())
    command = input_line[0]

    if command == 'all':
        S = set([i for i in range(1, 21)])
        continue

    if command == 'empty':
        S.clear()
        continue

    value = int(input_line[1])

    if command == 'add':
        S.add(value)
        continue

    if command == 'remove':
        S.discard(value)
        continue

    if command == 'check':
        if S.__contains__(value):
            print(1)
        else:
            print(0)
        continue

    if command == 'toggle':
        if S.__contains__(value):
            S.remove(value)
        else:
            S.add(value)
        continue
