input_num = list((input("Enter a sequence of numbers").split(',')))
print(input_num)
if input_num[0] == input_num[-1]:
    print("True")
else:
    print("First and last value in the list does not match.")
