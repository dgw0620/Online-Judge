def solution(my_string):
    EX = "aeiou"
    for x in EX:
        my_string = my_string.replace(x, "")
        
    return my_string