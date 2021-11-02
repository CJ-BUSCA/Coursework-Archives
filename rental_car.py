import sys
'''
Rental Car Script
IT-140
CJ BUSCA
'''
#User inputs the code associated with what type of rental they want as well as days
rentalCode = input("(B)udget, (D)aily, or (W)eekly rental?\n")

if rentalCode == 'W':
  rentalPeriod = input("Number of weeks rented:\n");
elif rentalCode == 'B':
  rentalPeriod = input("Number of Days Rented:\n");
elif rentalCode == 'D':
  rentalPeriod = input("Number of Days Rented:\n");

#This section is the inital price for each rental
budget_charge = 40.00
daily_charge = 60.00
weekly_charge = 190.00

if rentalCode == 'B':
  baseCharge = int(rentalPeriod) * int(budget_charge)
elif rentalCode == 'D':
  baseCharge = int(rentalPeriod) * int(daily_charge)
elif rentalCode == 'W':
  baseCharge = int(rentalPeriod) * int(weekly_charge)



#Values for the odometer reading and identifies the totalMiles variable
odoStart=1234
odoEnd=2222
totalMiles = int(odoEnd) - int(odoStart)
print("Starting Odometer Reading:")
print("Ending Odometer Reading:")

#This section handles the calculation depending on the user input
 
if rentalCode == 'B':
  baseCharge = int(rentalPeriod) * int(budget_charge)
elif rentalCode == 'D':
  baseCharge = int(rentalPeriod) * int(daily_charge)
elif rentalCode == 'W':
  baseCharge = int(rentalPeriod) * int(weekly_charge)

  
if rentalCode == "B":
  mileCharge = float(totalMiles) * 0.25;
  
elif rentalCode == 'D':
  averageDayMiles = float(totalMiles)/float(rentalPeriod);
  if float(averageDayMiles) <= 100:
    extraMiles = 0;
  else:
      extraMiles = float(averageDayMiles) - 178.08;
  mileCharge = (.25 * float(extraMiles)) * float(rentalPeriod);
  
elif rentalCode == 'W':
  averageWeekMiles = float(totalMiles)/ float(rentalPeriod);  
  if averageWeekMiles <= 900:
    mileCharge = 0;
else:
    mileCharge = 100 * float(rentalPeriod);

amtDue = float(baseCharge) + float(mileCharge)

#This is the results

print("Rental Summary")
print("Rental Code:       " + str(rentalCode))
print("Rental Period:       " + str(rentalPeriod)) 
print("Starting Odometer: " + str(odoStart))
print("Ending Odometer:   " + str(odoEnd))
print("Miles Driven:      " + str(totalMiles))
print("Amount Due:        " + "$" + str(amtDue) + '0')
