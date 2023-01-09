import sys

N: int = int(sys.stdin.readline().rstrip())

for i in range(N):
    # 프린트 함수 내에서 직접 입력 받기 연습
    print(f'{i + 1}. {sys.stdin.readline().rstrip()}')
