def solution(s1, s2):
    s1.sort()
    s2.sort()
    
    n = 0
    k = 0
    answer = 0
    
    while n < len(s1) and k < len(s2):
        if s1[n] == s2[k]:
            answer += 1
            n += 1
            k += 1
        elif s1[n] < s2[k]:
            n += 1
        else:
            k += 1

    return answer