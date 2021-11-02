'''My tarot card program'''
import random
#This block is the selection of cards that may be chosen
d = str(input("Enter what you want: "))
MajorArc = {'THE FOOL':0, 'THE MAGICIAN':1, 'THE HIGH PRIESTESS':2, 'THE EMPRESS':3, 'THE EMPEROR':4, 'THE HIEROPHANT':5, 'THE LOVERS':6, 'THE CHARIOT':7, 'STRENGTH':8, 'THE HERMIT':9, 'WHEEL OF FORTUNE':10, 'JUSTICE':11, 'THE HANGED MAN':12, 'DEATH':13, 'TEMPERANCE':14, 'THE DEVIL':15, 'THE TOWER':16, 'THE STAR':17,'THE MOON':18, 'THE SUN':19, 'JUDGEMENT':20, 'THE WORLD':21}


#This block has the descriptions for each card that could be chosen
MajorArcDesc = {' innocence, new beginnings, free spirit,':0, 'willpower, desire, creation, manifestation,':1, 'intuitive, unconscious,':2, 'motherhood, fertility,':3, 'authority, structure,':4, 'tradition, conformity, morality, ethics,':5, 'partnerships, duality,':6, 'direction, control,':7, 'inner strength, bravery,':8, 'contemplation, search for truth, inner guidance,':9, 'change, cycles, inevitable fate,':10, 'cause and effect, clarity, truth,':11, 'sacrifice, release':12, 'end of cycle, beginnings, change,':13, 'middle path, patience,':14, 'addiction, materialism, playfulness,':15, 'sudden upheaval, broken pride, disaster,':16, 'hope, faith, rejuvenation':17,' unconscious, illusions, intuition':18, 'joy, success, celebration, positivity,':19, 'reflection, reckoning, awakening':20, 'fulfillment, harmony, completion':21}




print(MajorArc[d])
