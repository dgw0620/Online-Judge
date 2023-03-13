def solution(array):
    a_d = dict()
    answer = []
    
    for a in array:
        if a in a_d:
            a_d[a] += 1
        else:
            a_d[a] = 1

    for a in a_d:
        if a_d[a] == max(a_d.values()):
            
            answer.append(a)
    
    return answer[0] if len(answer) == 1 else -1