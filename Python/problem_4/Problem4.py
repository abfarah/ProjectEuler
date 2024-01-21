def solve():
    maxP = 0
    for i in range(999, 99, -1):
        for j in range(999, 99, -1):
            s = str(i*j)
            if s == s[::-1]:
                maxP = max(maxP, i*j)
    return str(maxP)

