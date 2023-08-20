input_value = int(input("Enter a integer value for which you want multiples : "))
print("Multiples of " + format(input_value) + " are:")
for value in range(1, 11):
    result = input_value * value
    print(input_value, ' * ', value, ' = ', result)


