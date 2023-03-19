def solution(array):
    return sum([str(a).count("7") for a in array])