import sys

students = [i for i in range(1, 31)]

for i in range(28):
    input_number = int(sys.stdin.readline().rstrip())
    students.remove(input_number)

students.sort()

for i in students:
    print(i)
