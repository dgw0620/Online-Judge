T = int(input())

for i in range(T):
    R, S = input().split()
    result = ''
    for s in S:
        for j in range(int(R)):
            result += s
    print(result)
