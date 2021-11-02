# Get our boolean values from the command line
import sys
isCold= sys.argv[1] == 'True'
isRainy= sys.argv[2] == 'True'

#This took me a few tries and some assistance...
if isCold and isRainy:
  print ('cold and rainy')
elif isCold and not isRainy:
  print ('cold and dry')
elif not isCold and isRainy:
  print ('warm and rainy')
else:
  print ('warm and dry')