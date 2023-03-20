def solution(id_pw, db):
    for d in db:
        if id_pw[0] == d[0] and id_pw[1] == d[1]:
            return "login"
        elif id_pw[0] == d[0]:
            return "wrong pw"
    return "fail"