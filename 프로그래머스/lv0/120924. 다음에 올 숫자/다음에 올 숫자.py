def solution(common):
    d = common[1] - common[0]
    check = 0
    for i in range(len(common)):
        if i < len(common) - 1 and common[i + 1] - common[i] != d:
            check = 1
            break
    
    if check == 0:
        return common[-1] + d
    else:
        return common[-1] * (common[1] / common[0])