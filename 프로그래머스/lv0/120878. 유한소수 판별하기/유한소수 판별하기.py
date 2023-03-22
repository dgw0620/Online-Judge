import math
def solution(a, b):
    b /= math.gcd(a, b)
    
    while b % 2 == 0 or b % 5 == 0:
        if b % 2 == 0:
            b //= 2
        if b % 5 == 0:
            b //= 5
    
    if b != 1:
        return 2
    else:
        return 1