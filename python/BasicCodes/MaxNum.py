#Q41. Write a java program to find maximum between three numbers.
a = int(input("Enter first number: "));
b = int(input("Enter Second number: "));
c = int(input("Enter Third number: "));

if( a>b and a>c):
	print(a , "is greater");
elif (b>a and b>c):
	print(b ,"is greater");
else:
	print(c, "is greater");
	