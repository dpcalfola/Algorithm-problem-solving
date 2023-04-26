import sys

N: int = int(sys.stdin.readline().rstrip())


def print_star():
    # Variable initialize
    odd_line: str = "-1"
    even_line: str = "-1"
    star_num: int = N // 2

    # N is even number
    if N % 2 == 0:
        odd_line = "* " * star_num
        even_line = " *" * star_num

    # N is odd number
    if N % 2 == 1:
        odd_line = "* " * (star_num + 1)
        even_line = " *" * star_num

    # Print stars
    for i in range(N * 2):
        print(odd_line if i % 2 == 0 else even_line)


print_star()
