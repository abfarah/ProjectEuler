# By Abdullahi Farah
# Problem 4:
# A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 * 99.
#
# Find the largest palindrome made from the product of two 3-digit numbers.
#

def isPalindrome(s):
    reverse = s[::-1]
    return (reverse == s)

def solve():
    largestPalindrome = 0
    i = 999
    while i >= 100:
        if i % 11 == 0:
            j = 999
            divCount = 1
        else:
            j = 990
            divCount = 11
        while j >= i:
            if (j*i) <= largestPalindrome:
                break
            if(isPalindrome(str(i*j))):
                largestPalindrome = i*j
            j -= divCount
        i -= 1
    return largestPalindrome

print(solve())
