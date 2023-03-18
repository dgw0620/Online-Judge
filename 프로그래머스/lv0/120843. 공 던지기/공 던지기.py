def solution(numbers, k):
    i = k * 2 - 2
    return numbers[i % len(numbers)]