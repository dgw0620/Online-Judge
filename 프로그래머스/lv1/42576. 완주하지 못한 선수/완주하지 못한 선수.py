def solution(participant, completion):
    comp_dict = {}
    for c in completion:
        if c not in comp_dict:
            comp_dict[c] = 1
        else:
            comp_dict[c] += 1
    
    for p in participant:
        if p not in comp_dict:
            answer = p
        else:
            comp_dict[p] -= 1
            if comp_dict[p] == -1:
                answer = p
    
    return answer