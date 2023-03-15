def solution(age):
    a_l = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j"]
    return "".join([a_l[int(a)] for a in str(age)])