def solution(lines):
    c = {i: 0 for i in range(-100, 101)}
    answer = 0
    
    for l in lines:
        for i in range(l[0], l[1]):
            c[i] += 1
    
    for i in range(-100, 101):
        if c[i] > 1:
            answer += 1
    
    return answer
        