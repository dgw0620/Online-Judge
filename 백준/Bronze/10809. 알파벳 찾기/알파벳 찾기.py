from string import ascii_lowercase

S = input()
alph_dict = {i: -1 for i in ascii_lowercase}

for s in S:
    alph_dict[s] = S.index(s)

for a in alph_dict:
    print(alph_dict[a], end=" ")