import sys

while True:
    user: list = list(map(str, sys.stdin.readline().split()))

    if user[0] == '#':
        break

    name: str = user[0]
    age: int = int(user[1])
    weight: int = int(user[2])

    if age > 17 or weight >= 80:
        print(f'{name} Senior')
    else:
        print(f'{name} Junior')

