from common import isPrime

def solve(numb):
    count, i = 0, 1
    while count < numb:
        if isPrime(i):
            count +=1
        i+=1
    return i-1

