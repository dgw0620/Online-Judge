def solution(babbling):
    answer = 0
    bl = ["aya", "ye", "woo", "ma"]
    for b in babbling:
        check = 0
        if bl[0] in b:
            b = b.replace(bl[0], "_")
        if bl[1] in b:
            b = b.replace(bl[1], "_")
        if bl[2] in b:
            b = b.replace(bl[2], "_")
        if bl[3] in b:
            b = b.replace(bl[3], "_")
        for i in b:
            if i != "_":
                check = 1
        if check == 0:
            answer += 1
    return answer