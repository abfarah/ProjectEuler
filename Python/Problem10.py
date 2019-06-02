# coding=utf-8
# By Abdullahi Farah
# Problem 10:
# The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
# 
# Find the sum of all the primes below two million.
# 

import Common

def solve(count):
    result = 2
    for i in range(3, count, 2):
        if Common.isPrime(i):
            result += i
    return result

print solve(2000000)
