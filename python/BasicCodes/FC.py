#a = 100;
#print(type(a));
#b = "Abc";
#print(type(b));


a =int(input("Enter first Number : "))
b =int(input("Enter Second Number: "))

print("Before Swapping: ");
print("A=",a); #10
print("B=",b); #20

a = a + b; # a = 10 + 20 = 30
b = a - b; # b = 30-20 = 10
a = a - b; # a= 30 -10 = 20

print("After Swapping: ");
print("A=",a); #20
print("B=",b); #10
