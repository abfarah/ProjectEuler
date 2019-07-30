# By Abdullahi Farah
# Problem 7:
# 
# By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
# 
# What is the 10,001st prime number?
import sys
sys.path.append(".")
sys.path.append("../common")

import Common

def solve(n):
	result = 1
	count = 1
	while count != n:
		result += 2
		if Common.isPrime(result):
			count += 1
	return result

