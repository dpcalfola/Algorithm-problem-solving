# 객체 지향적 접근

import sys


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

n = int(sys.stdin.readline().rstrip())

finger_obj: Finger = Finger(init_finger=1, init_direction="right")

# Count one by one.
# Note: The first finger is already counted. So loop starts from 1.
for _ in range(1, n):
    finger_obj.next_finger(
        init_direction=finger_obj.get_current_direction,
        init_finger=finger_obj.get_current_finger,
    )

print(finger_obj.get_current_finger)
