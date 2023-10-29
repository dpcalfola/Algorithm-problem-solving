import sys

decimal_num = int(sys.stdin.readline().rstrip(), 2)
octal_num = oct(decimal_num)[2:]
print(octal_num)
