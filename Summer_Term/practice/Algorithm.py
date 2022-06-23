from numpy import append

print("Helllo")
def printNCharacterPasswords (prefix, num):
    if num == 0:
        print(prefix) 
    for letter in ('a', 'r', 'j', 'u', 'n'):
        printNCharacterPasswords (prefix + letter, num - 1)