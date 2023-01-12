"""
Using this snippet as annotation

Caution:
    If the code has input task, elapsed time will be included waiting time for input task
    That means, elapsed time will be massive long than actual elapsed time

    So If you want to check the performance accurately,
    save sample input value instead of input task
    to eliminate the time that occurs in the input process.
"""

import time


def estimate_time(func):
    def wrapper(*args, **kwargs):
        start_time: float = time.perf_counter()
        result: float = func(*args, **kwargs)
        end_time: float = time.perf_counter()
        elapsed_time_ms: float = (end_time - start_time) * 1000
        print(f'Elapsed time: {elapsed_time_ms:.2f} ms')
        return result

    return wrapper
