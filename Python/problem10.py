from common import isPrime

def solve(numb):
    res = 0
    for i in range(1, numb+1):
        if isPrime(i):
            res += i
    return res

