import sys

# Save to list 10 integers using for pythonic way
numbers: list[int] = [int(sys.stdin.readline().rstrip()) for _ in range(10)]

# Avg
avg: int = sum(numbers) // 10

# Mode
numbers_set: set[int] = set(numbers)
mode: int = max(numbers_set, key=numbers.count)

# Print answer
print(avg, mode, sep='\n')