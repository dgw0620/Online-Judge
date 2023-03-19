def solution(my_string):
    answer = []
    temp = ""
    for i in range(len(my_string)):
        if my_string[i].isdigit():
            temp += my_string[i]
        elif temp != "":
            answer.append(temp)
            temp = ""
        if temp != "" and i == len(my_string) - 1:
            answer.append(temp)
    return sum(map(int, answer))
            