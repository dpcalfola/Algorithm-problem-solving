import sys

N = int(sys.stdin.readline().rstrip())
total_scores = []

for _ in range(N):
    dice = list(map(int, sys.stdin.readline().split()))
    dice.sort()

    # Three spots are the same
    if dice[0] == dice[2]:
        score = 10000 + dice[0] * 1000
        total_scores.append(score)
    # Three spots are the same
    elif dice[0] == dice[1] or dice[1] == dice[2]:
        score = 1000 + dice[1] * 100
        total_scores.append(score)
    # No same spot of dice
    else:
        score = dice[2] * 100
        total_scores.append(score)

total_scores.sort()

print(total_scores[N - 1])
