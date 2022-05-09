T = int(input())
for i in range(T):
    x, y = 1, 0
    H, W, N = map(int,input().split())
    for k in range(N):
        if y == H:
            y = 0
            x += 1
        y += 1
    print('%d%02d'%(y,x))