myString = "Python is named after the Monty " \
           "Python Flying Circus TV show."
aChar = 'V'
def findIt(character, phrase):
  i = 0
  while i < len(phrase):
    if phrase[i] == character:
      return i
    i += 1
  return -1


searchResult = findIt(aChar, myString)
if (searchResult == -1):
  print(aChar, 'was found not found')
else:
  print (aChar, 'was found at index position', searchResult)
