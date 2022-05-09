n, m = map(int, input().split())
num = list()

num = list(map(int,input().split()))

tmp = 0

for i in range(n):
    for j in range(i + 1, n):
        for k in range(j + 1, n):
            if (num[i] + num[j] + num[k]) <= m and tmp < (num[i] + num[j] + num[k]):
                tmp = num[i] + num[j] + num[k]

print(tmp)