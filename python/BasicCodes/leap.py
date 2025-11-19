#Q38. Write a Java program to check whether a year is leap year or not
n = int(input("Enter age: "));
if ((n % 100!=0 and n % 4==0) or n % 400==0):
	print("it is leap year");
else:
	print("it is not leap year");