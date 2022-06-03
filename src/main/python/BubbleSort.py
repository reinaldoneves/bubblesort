
list = [6,4,5,3,1,2]
print("Before sorting: ", list)
for i in range(0, len(list)-1):
    for j in range(0, len(list)-1-i):
        list[j], list[j+1] = list[j+1], list[j]
print("After sorting: ", list)