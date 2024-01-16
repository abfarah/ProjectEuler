def solve(count):
    seen = set()
    result = 0
    three, five = 3, 5
    while three < count:
        seen.add(three)
        result += three
        three += 3 
    while five < count:
        if five not in seen:
            result += five
        five += 5
    return result

print(solve(1000))
