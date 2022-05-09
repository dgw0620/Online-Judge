n = int(input())
i = 2

while i <= n:
    if n % i == 0:
        n /= i
        print(i)
        i -= 1
    i += 1