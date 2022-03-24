import sys

ISBN = "9780921418"
sum_of = 0

for _ in range(0, 3):
    ISBN += sys.stdin.readline().rstrip()

for i in range(0, len(ISBN)):
    if i % 2 == 0:
        sum_of += int(ISBN[i])
    else:
        sum_of += int(ISBN[i]) * 3

print("The 1-3-sum is " + str(sum_of))
