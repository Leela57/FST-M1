def sumof(n):
    if n > 0:
        return n + sumof(n-1)
    else:
        return 0


res = sumof(10)
print("Sum is : ", res)
