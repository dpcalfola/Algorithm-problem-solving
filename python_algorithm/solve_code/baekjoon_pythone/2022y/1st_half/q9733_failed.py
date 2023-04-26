import collections
import sys

input_1 = ""
input_2 = ""

try:
    input_1 = sys.stdin.readline()
except EOFError:
    pass

try:
    input_2 = sys.stdin.readline()
except EOFError:
    pass

arr = list(input_2.split()) + list(input_1.split())
dic_counter = collections.Counter(arr)

total = len(arr)

sequences = ["Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"]

for sequence in sequences:
    cnt = dic_counter[sequence]
    print(f"{sequence} {cnt} {cnt / total:.2f}")

print(f"Total {total} 1.00")
