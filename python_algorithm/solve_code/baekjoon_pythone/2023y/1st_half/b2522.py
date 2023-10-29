import sys

input_n: int = int(sys.stdin.readline().rstrip())


def solve(n: int) -> str:
    asterisk_string: str = "*"
    space_string: str = " "
    result = ""

    for i in range(1, n + 1):
        result_line: str = ""
        result_line += space_string * (n - i)
        result_line += asterisk_string * i
        result += result_line + "\n"

    for i in range(n - 1, 0, -1):  # 2, 1
        result_line: str = ""
        result_line += space_string * (n - i)
        result_line += asterisk_string * i
        result += result_line + "\n"

    return result.rstrip()


# TEST EXAMPLE
example_n: int = 3
expected_result = """  *
 **
***
 **
  *
""".rstrip()
assert solve(example_n) == expected_result, "Error: Could not pass example"

# Print Answer
print(solve(input_n))
