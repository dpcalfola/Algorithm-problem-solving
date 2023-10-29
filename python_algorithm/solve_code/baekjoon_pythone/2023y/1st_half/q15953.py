"""
I spent about four hours without rest solving this problem
Even though the problem is Bronze 3 difficulty

However, I am so satisfied with today's coding
Because I learned and exercised so many things about Python OOP
Especially, I understood these lists of skills more deeply
    - Class inheritance,
    - Abstract method with annotation,
    - Getter and Setter annotation,
    - etc.

Also, I've got the point about the Similarity between Python Dictionary and JSON.
Awesome !!

Although, for making clean code, here,
there's almost code wear deleted that connected with them.
But I leave this message to express my feeling of exaltation

Happy developing !!
"""

import sys


class Prize:
    def __init__(self, data_2017: dict):
        self.win_group: list[int] = data_2017.get("win_group")
        self.prize_money: list[int] = data_2017.get("prize_money")
        self.num_win_group: list[int] = data_2017.get("num_win_group")

        # Calculate rank boundary list
        self.rank_boundary: list[int] = self.calculate_rank_boundary()

    # I Want to know
    # - How to this method make it does not callable by created object?
    # - It means this method should be used only inside of class
    def calculate_rank_boundary(self) -> list[int]:
        rank: int = 0
        boundary_list: list[int] = []
        for i in self.num_win_group:
            rank += i
            boundary_list.append(rank)
        return boundary_list

    def get_prize_money(self, rank: int) -> int:
        # Parameter 'rank' is 0 means fail to entry, so there's no prize money
        if rank == 0:
            return 0
        #
        for i in range(len(self.rank_boundary)):
            boundary = self.rank_boundary[i]
            if rank <= boundary:
                return self.prize_money[i]
        # Out of prize ranked if reached at here
        return 0


given_data: dict = {
    "fest2017": {
        "win_group": [1, 2, 3, 4, 5, 6],
        # unit: 만원
        "prize_money": [500, 300, 200, 50, 30, 10],
        "num_win_group": [1, 2, 3, 4, 5, 6],
    },
    "fest2018": {
        "win_group": [1, 2, 3, 4, 5],
        # unit: 만원
        "prize_money": [512, 256, 128, 64, 32],
        "num_win_group": [1, 2, 4, 8, 16],
    },
}

# Create Prize object for each fest
fest2017: Prize = Prize(given_data.get("fest2017"))
fest2018: Prize = Prize(given_data.get("fest2018"))

# Start Solving !!
case_num: int = int(sys.stdin.readline().rstrip())

for _ in range(case_num):
    rank2017: int
    rank2018: int
    rank2017, rank2018 = map(int, sys.stdin.readline().rstrip().split())

    # Earned money (unit: 만원)
    earned = fest2017.get_prize_money(rank2017) + fest2018.get_prize_money(rank2018)

    print(earned * 10000)
