def GCD(a, b):
    if b == 0:
        return a
    else:
        return GCD(b, a % b)

n = int(input())

for _ in range(n):
    a, b = map(int, input().split())
    GCD_n = GCD(a, b)
    print(int(a * b / GCD_n))