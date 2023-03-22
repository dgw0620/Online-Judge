N = int(input())

for i in range(N):
    S = input()
    temp = 0
    sum = 0

    for s in S:
        if s == "O":
            temp += 1
        else:
            temp = 0
        sum += temp

    print(sum)