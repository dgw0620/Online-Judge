def solution(s):
    return "".join(sorted(list(x for x in set(s) if s.count(x) == 1)))