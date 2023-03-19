def solution(spell, dic):
    for d in dic:
        if sorted(d) == sorted("".join(spell)):
            return 1
    return 2