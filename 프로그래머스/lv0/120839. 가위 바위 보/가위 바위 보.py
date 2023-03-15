def solution(rsp):
    return "".join("0" if r == "2" else "5" if r == "0" else "2" for r in rsp)