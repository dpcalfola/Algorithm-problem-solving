import sys

n: int = int(sys.stdin.readline().rstrip())
reminder_apple_n: int = 0

for _ in range(n):
    student_n, apple_n = map(int, sys.stdin.readline().split())
    reminder_apple_n += apple_n % student_n

print(reminder_apple_n)
