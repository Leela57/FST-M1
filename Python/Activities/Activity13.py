def sum(list1):
    tot = 0
    for i in list1:
        tot = tot + i
    return tot


a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
res = sum(a)
print("Total of 0 to 9 is : ", res)
