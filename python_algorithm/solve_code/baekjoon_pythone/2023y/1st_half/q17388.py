import sys

scores: list[int] = list(map(int, sys.stdin.readline().split()))

score_and_school: dict[int, str] = {scores[0]: 'Soongsil', scores[1]: 'Korea', scores[2]: 'Hanyang'}

total_score: int = sum(scores)
min_score: int = min(scores)
min_school: str = score_and_school[min_score]

print('OK') if total_score >= 100 else print(min_school)
