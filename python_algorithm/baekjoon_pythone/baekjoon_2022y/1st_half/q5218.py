import sys

T: int = int(sys.stdin.readline().rstrip())


def exec_case():
    input_x, input_y = map(str, sys.stdin.readline().split())
    chars_x: list = list(input_x)
    chars_y: list = list(input_y)

    # Print prefix
    print('Distances: ', end='')

    # Print distance each position
    for i in range(len(chars_x)):
        ascii_x: int = ord(chars_x[i])
        ascii_y: int = ord(chars_y[i])

        # if Condition: Second Character is larger than first one
        if ascii_y >= ascii_x:
            distance = ascii_y - ascii_x
        else:
            distance = ascii_y + 26 - ascii_x

        print(distance, end=" ")

    # Line break
    print()


# Do solve function for T times
for _ in range(T):
    exec_case()
