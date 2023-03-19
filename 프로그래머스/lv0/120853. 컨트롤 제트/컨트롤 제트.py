def solution(s):
    s = s.split()
    i = 0
    while i < len(s):
        if s[i] == "Z":
            del s[i], s[i - 1]
            i -= 1
        else:
            i += 1
    
    
    return sum(map(int, s))