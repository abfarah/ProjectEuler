# coding=utf-8
# By Abdullahi Farah
# Problem 9:
# A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
# 
# a2 + b2 = c2
# For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
# 
# There exists exactly one Pythagorean triplet for which a + b + c = 1000.
# Find the product abc.
# 

def solve():
    limit = 1000
    c = 0
    for a in range(limit):
        for b in range(limit-a):
            c = limit-(a+b)
            if a**2 + b**2 == c**2 and a!=0 and b!=0 and c!=0:
                return a*b*c
    return "No Pythagorean triplit exists for input"
