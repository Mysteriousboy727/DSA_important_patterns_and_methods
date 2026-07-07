n = 19
list = []
sum = 0

while n != 1:
    sum = 0
    while n > 0:
        rem = n % 10
        sum = sum + rem * rem
        n = n // 10

    if sum in list:
        print("sad number")
        break

    list.append(sum)
    n = sum

else:
    print("happy number")