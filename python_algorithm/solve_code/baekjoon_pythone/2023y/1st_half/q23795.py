import sys


class PythonicWay:
    def __init__(
        self,
    ):
        self.list: list[int] = []
        self.save_string: str = ""

        # Make input list immediately when object is created
        self.make_input_list()

    def make_input_list(self):
        # Save int input to string until input is -1
        while True:
            current_input: str = sys.stdin.readline().rstrip()
            if current_input == "-1":
                break
            self.save_string += current_input + ","

        # Remove last comma
        self.save_string = self.save_string[:-1]

        # Save string to list as pythonic list comprehension
        self.list = [int(i) for i in self.save_string.rstrip().split(",")]

    @property
    def get_list(self) -> list[int]:
        return self.list

    @property
    def get_sum_of_list(self) -> int:
        return sum(self.list)


# ♥️ Code Start From Here ♥️
p_obj: PythonicWay = PythonicWay()
print(p_obj.get_sum_of_list)
