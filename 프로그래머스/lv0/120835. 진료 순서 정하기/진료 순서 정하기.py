def solution(emergency):
    return [len(emergency) - emergency.index(e) for e in sorted(emergency)]