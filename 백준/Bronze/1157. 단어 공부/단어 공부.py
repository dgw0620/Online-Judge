
word = input().upper()
word_d = dict.fromkeys(word)

for k in word_d:
    word_d[k] = word.count(k)

if len([k for k, v in word_d.items() if max(word_d.values()) == v]) > 1:
    print("?")
else:
    print(max(word_d, key=word_d.get))