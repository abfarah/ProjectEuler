from common import primeFactors

def solve():
    arr = [primeFactors(i) for i in range(21)]
    maxNumb = 1
    for i in range(21):
        maxSoFar = 0
        for dic in arr:
            if i in dic:
                maxSoFar = max(maxSoFar, dic[i])
        if maxSoFar > 0:
            maxNumb *= i**maxSoFar
    return maxNumb

