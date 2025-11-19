#Q35. Write a Java program to check whether a number is divisible by 5 and 11 or not. 
x = int(input("Enter Number: "));

if x % 5 ==0 and x % 3==0:
    print("Number is divisible by 5 or 3");
else:
    print("Number is not divisible by 5 or 3");