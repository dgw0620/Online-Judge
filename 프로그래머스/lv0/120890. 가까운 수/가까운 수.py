def solution(array, n):
    d = list()
    c = list()
    for i in range(len(array)):
        d.append(abs(array[i] - n))
    for j in range(len(d)):
        if min(d) == d[j]:
            c.append(array[j])
    return min(c)