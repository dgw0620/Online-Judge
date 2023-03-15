def solution(cipher, code):
    return "".join([str(cipher[i]) for i in range(code - 1, len(cipher), code)])