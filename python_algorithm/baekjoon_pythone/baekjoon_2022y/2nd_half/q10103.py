import sys

n = int(sys.stdin.readline().rstrip())

chang_score = 100
sang_score = 100

for _ in range(n):
    chang_dice, sang_dice = map(int, sys.stdin.readline().split())
    if chang_dice == sang_dice:
        continue
    if chang_dice > sang_dice:
        sang_score -= chang_dice
    if chang_dice < sang_dice:
        chang_score -= sang_dice

print(chang_score)
print(sang_score)
