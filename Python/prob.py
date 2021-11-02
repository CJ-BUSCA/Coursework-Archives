total = 0
numbers = ['six', 'twenty' , 'eleven']
for row in range(0, len(numbers)):
      rowtotal = 0
      for col in range(0, len(numbers[0])):
         rowtotal += int(numbers[row][col])
print(rowtotal)
total += rowtotal
print(total)
