import sys

competition_result: dict = {}

for i in range(1, 6):
    cook_scores: list = list(map(int, sys.stdin.readline().split()))
    sum_score = sum(cook_scores)
    competition_result[i] = sum_score

winner_score: int = max(competition_result.values())
winner_cook: int = max(competition_result, key=competition_result.get)

print(winner_cook, winner_score)
