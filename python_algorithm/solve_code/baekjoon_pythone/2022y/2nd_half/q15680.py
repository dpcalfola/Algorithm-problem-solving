import sys

N: int = int(sys.stdin.readline().rstrip())

collage_name: str = "YONSEI"
slogan: str = "Leading the Way to the Future"

print(collage_name if N == 0 else slogan)
