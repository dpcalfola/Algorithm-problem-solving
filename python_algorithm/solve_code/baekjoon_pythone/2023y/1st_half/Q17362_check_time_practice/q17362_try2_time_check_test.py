# 객체 지향적 접근

import sys
from snippets.estimate_execution_time import estimate_time


class Finger:
    def __init__(self, init_finger: int = 1, init_direction: str = "none"):
        self.thumb: int = 1
        self.index: int = 2
        self.middle: int = 3
        self.ring: int = 4
        self.pinky: int = 5

        self.init_finger: int = init_finger
        self.init_direction: str = init_direction

        self.current_finger: int = init_finger
        self.current_direction: str = init_direction
        return

    def next_finger(self, init_direction: str, init_finger: int) -> tuple[str, int]:
        finger: int = init_finger
        direction: str = init_direction

        if direction == "right":
            if 0 < finger < 5:
                finger += 1
            elif finger == 5:
                finger = 4
                direction = "left"
        elif direction == "left":
            if 1 < finger <= 5:
                finger -= 1
            elif finger == 1:
                finger = 2
                direction = "right"

        self.current_finger = finger
        self.current_direction = direction

        return self.current_direction, self.current_finger

    @property
    def get_current_finger(self) -> int:
        return self.current_finger

    @property
    def get_current_direction(self) -> str:
        return self.current_direction


# ♥️ Calculating Code Start From Here ♥️
@estimate_time
def do_it():
    n = int(sys.stdin.readline().rstrip())

    finger_obj: Finger = Finger(init_finger=1, init_direction="right")

    # Second Try: n for loop replace with n % 8 (n % 8 == 0 -> 8)
    #   Result repetitive pattern is 8
    #   For calculate efficiency, removed repetitive pattern with n to n % 8
    #   And It makes me not to modify or give up my OOP style code 🙃
    removed_repetitive_pattern: int = (n % 8 + 8) if n % 8 == 0 else n % 8

    # Count one by one.
    # Note: The first finger is already counted. So loop starts from 1.
    for i in range(1, removed_repetitive_pattern):
        finger_obj.next_finger(
            init_direction=finger_obj.get_current_direction,
            init_finger=finger_obj.get_current_finger,
        )

    print(finger_obj.get_current_finger)
    return


do_it()
