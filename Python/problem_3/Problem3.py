def solve(numb):
    maxPrime, cur, n = -1, 2, numb
    while cur * cur <= n:
        while n % cur == 0:
            maxPrime = cur
            n = n // cur
        cur += 1
    return n if n > 1 else maxPrime

