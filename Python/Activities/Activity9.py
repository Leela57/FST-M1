list1 = list((1, 3, 5, 2, 4, 6, 8))
list2 = list((7, 9, 11, 14, 10, 15))
list3 = []
for i in list1:
    if (i % 2) != 0:
        list3.append(i)
for j in list2:
    if (j % 2) == 0:
        list3.append(j)
print(list3)


