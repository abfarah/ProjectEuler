import math
from collections import defaultdict

def isPrime(numb):
	if numb == 1:
		return False
	if numb < 4:
		return True
	if numb % 2 == 0:
		return False
	if numb < 9:
		return True
	if numb % 3 == 0:
		return False

	limit = int(math.sqrt(numb))
	count = 5
	while count <= limit:
		if numb % count == 0:
			return False
		count += 2
	return True

def isPalindrome(s):
    reverse = s[::-1]
    return (reverse == s)

def primeFactors(n):
    if n < 1:
        return {}
    numb = n
    h = defaultdict(int)
    while numb % 2 == 0:
        h[2] += 1
        numb = numb // 2 

    for i in range(3, int(math.sqrt(numb))+1, 2):
        while numb % i == 0 and numb != 0:
            h[i] += 1
            numb = numb // i 
    if numb > 2:
        h[numb] += 1
    return h

def divisorCount(n):
    count = 0
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            count += 2
        if int(n**0.5)**2 == n:
            count -= 1
    return count

