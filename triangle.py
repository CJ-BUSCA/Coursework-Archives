import math

print("It's triangle fun time! Enter the numbers you know, and a ? for the number you don't.")

sideA = int(input("Side A: "))
sideB = int(input("Side B: "))
sideC = int(input("Hypotenuse: "))

if sideA == ("?"):
    print("Side A =", sideC ** 2 - sideB**2)

elif sideB == ("?"):
    print("Side B =", sideC ** 2 - sideA**2)

elif sideC == ("?"):
    print("Side C =", math.sqrt(sideA)**2 + (sideB)**2)
