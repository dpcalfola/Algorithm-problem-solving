import sys

N, M = map(int, sys.stdin.readline().split())

dic = {}

for i in range(1, N + 1):
    input_pokemon = sys.stdin.readline().rstrip()
    dic[str(i)] = input_pokemon
    dic[input_pokemon] = i

for _ in range(M):
    in_str_key = sys.stdin.readline().rstrip()
    print(dic[in_str_key])
