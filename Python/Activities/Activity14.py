def myFebnocci(num):
    if num <= 1:
        return 1
    else:
        return myFebnocci(num - 1) + myFebnocci(num - 2)


userValue = int((input("Enter a number : ")))
if userValue <= 0:
    print("Enter a positive number")
else:
    for i in range(userValue):
        print(myFebnocci(i))


