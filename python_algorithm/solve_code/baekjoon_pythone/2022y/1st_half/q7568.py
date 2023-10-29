import sys

num_of_giant = int(sys.stdin.readline())

giant_list = []

for _ in range(num_of_giant):
    input_value = list(map(int, sys.stdin.readline().split()))
    giant = {"weight": input_value[0], "height": input_value[1]}
    giant_list.append(giant)

for i in giant_list:
    ranking = 1
    for j in giant_list:
        if i["weight"] < j["weight"] and i["height"] < j["height"]:
            ranking += 1

    print(ranking, end=" ")
