def solution(n):
    answer = set()
    i = 2
    while n > 1:
        if n % i == 0 and i not in answer:
            answer.add(i)
            n //= i
            i = 2
        elif n % i == 0 and i in answer:
            n //= i
            i = 2
        else:
            i += 1
        
    return sorted(list(answer))