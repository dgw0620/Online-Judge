def solution(numbers):
    l = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    
    for i in range(len(l)):
        if l[i] in numbers:
            numbers = numbers.replace(l[i], str(i))
    return int(numbers)