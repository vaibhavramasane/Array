#Q40. Write a java program to input any character and check whether it is alphabet, digit or special character.

ch = input("Enter Character: ");

if (ch>='a' and ch<='z') or (ch>='A' and ch<='Z'):
	print("Alphabets");
	
elif (ch>='0' and ch<='9'):
	print("Digit");
	
else:
	print("Special Character");
	