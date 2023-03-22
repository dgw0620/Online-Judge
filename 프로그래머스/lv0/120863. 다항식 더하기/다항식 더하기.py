def solution(polynomial):
    polynomial = polynomial.split(" + ")
    a = []
    b = []
    
    for p in polynomial:
        if "x" in p:
            if p == "x":
                p = 1
            else:
                p = p.rstrip("x")
            a.append(int(p))
        else:
            b.append(int(p))
    
    if sum(a) > 1 and sum(b) != 0:
        return str(sum(a)) + "x + " + str(sum(b))
    elif sum(a) == 1 and sum(b) != 0:
        return "x + " + str(sum(b))
    elif sum(a) == 0  and sum(b) != 0:
        return str(sum(b))
    elif sum(a) > 1 and sum(b) == 0:
        return str(sum(a)) + "x"
    elif sum(a) == 1 and sum(b) == 0:
        return "x"
    else:
        return "0"
    
    