import heapq
import sys


class MaxHeap:
    memory = []

    def push_(self, data):
        heapq.heappush(self.memory, data * -1)

    def pop_(self):
        return heapq.heappop(self.memory) * -1


heap = MaxHeap()

exe_counter = int(sys.stdin.readline().rstrip())

for i in range(exe_counter):
    order = int(sys.stdin.readline().rstrip())
    if order == 0:
        print(0) if len(heap.memory) == 0 else print(heap.pop_())
    else:
        heap.push_(order)
