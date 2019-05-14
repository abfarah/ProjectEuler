# By Abdullahi Farah
# Problem 5:
# 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
# 
# What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
import math

def solve():
    primeNumb = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
    numb = 20
    result = 1 
    limit = math.sqrt(numb)
    count = 0
    check = True
    exponent = 0 
    while primeNumb[count] <= numb:
        exponent = 1
        if check:
            if primeNumb[count] <= limit:
                exponent = math.floor(math.log(numb) / math.log(primeNumb[count]))
            else:
                check = False
        result *= (primeNumb[count]**exponent)
        count += 1
    return result

print(solve())
