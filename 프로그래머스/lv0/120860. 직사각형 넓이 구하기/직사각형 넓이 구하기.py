def solution(dots):
    dots.sort()
    return abs(dots[0][0] - dots[3][0]) * abs(dots[0][1] - dots[3][1])