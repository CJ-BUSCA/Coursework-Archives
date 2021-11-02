#import random
#print(random.randint(1, 10))

'''Oftentimes, you will need to generate a random number within a specific range as part of your application programming. This section provides you with ways to accomplish this task using Python.
Python includes a module called random. To use this module, we need to use the import random statement in our code. Here is an example of using the random.randint() function to generate a random number between 1 and 10:'''

#
# Randomization
#
import random
answer = (random.randint(1, 10))
guess = int(input('Enter Your Guess: '))
if answer == guess:
  print ("You win.")
else:
  print("You are wrong. Correct answer was ", answer)
