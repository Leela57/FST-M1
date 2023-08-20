try:
    print(x)
except NameError:
    print("An exception occurred - Variable x is not defined")
else:
    print("Something went wrong")