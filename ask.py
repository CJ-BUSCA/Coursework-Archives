myFile = open("cat2numbers.txt", "wt")   
list = []  # An empty list 
sentence = ""  # Sentence is equal to the sentence that will be entered

print("Writing to the file: ", myFile) # Telling the user what file they will be writing to 
sentence = input("Please enter a sentence without punctuation ") # Asking the user to enter a sentenc
sentence = sentence.lower() # Turns everything entered into lower case
words = sentence.split() # Splitting the sentence into single words
positions = [words.index(word) + 1 for word in words]
for i in range(1,9):
    s = repr(i)
    print("The positions are being written to the file")
    d = ', '.join(map(str,positions)) 
    myFile.write(positions) # write the places to myFile
    myFile.write("\n")
    myFile.close() # closes myFile
    print("The positions are now in the file") 
