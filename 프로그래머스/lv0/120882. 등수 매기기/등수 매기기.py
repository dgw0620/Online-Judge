def solution(score):
    c = score.copy()
    score.sort(key=lambda x: sum(x), reverse=True)
    j = 0
    temp = sum(score[0])
    answer = [0] * len(score)
    for i in range(len(score)):
        if temp != sum(score[i]):
            temp = sum(score[i])
            j = i
        answer[c.index(score[i])] = j + 1
    return answer