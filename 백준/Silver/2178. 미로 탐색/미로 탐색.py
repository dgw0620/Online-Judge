import sys
from collections import deque
input = sys.stdin.readline

def bfs(dq):
    while dq:
        y, x, cnt = dq.popleft()
        for d in dir:
            yy = y + d[0]
            xx = x + d[1]
            if yy < 0 or xx < 0 or yy >= n or xx >= m or maze[yy][xx] != 1:
                continue
            elif yy == n - 1 and xx == m - 1:
                print(cnt + 1)
                exit(0)
            else:
                dq.append((yy, xx, cnt + 1))
                maze[yy][xx] = -1


n, m = map(int, input().split())
maze = [list(map(int, input().strip())) for _ in range(n)]

dir = [[-1, 0], [0, 1], [1, 0], [0, -1]]
dq = deque([(0, 0, 1)])

bfs(dq)