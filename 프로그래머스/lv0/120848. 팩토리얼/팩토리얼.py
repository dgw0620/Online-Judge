def solution(n):
    k = 1
    i = 1
    while True:
        i *= k
        if i > n:
            return k - 1
        k += 1