import sys

num = int(sys.stdin.readline())

a_list = [True]

for _ in range(num):
    b_list = []
    for i in a_list:
        if i:
            b_list.append(False)
        else:
            b_list.append(False)
            b_list.append(True)

    a_list = []
    for i in b_list:
        a_list.append(i)

print(a_list.count(True), a_list.count(False))
