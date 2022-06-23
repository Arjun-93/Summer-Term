   
def roman_numerals(str):
    dict1 = {
    "I":1,
    "V":5,
    "X":10,
    "L":50,
    "C":100,
    "D":500,
    "M":1000,
}
    for key in str :
        for e in key:
            temp = 0;
            if str in dict1 :
                temp = temp + dict[str]
    return print(temp)
roman_numerals("XL")
