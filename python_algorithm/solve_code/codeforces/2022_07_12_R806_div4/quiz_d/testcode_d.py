def get_two_strings(s: str):
    len_of_s: int = len(s)
    for i in range(1, len_of_s):
        print(s[:i], s[i:])


string_a = "actec"
get_two_strings(string_a)
