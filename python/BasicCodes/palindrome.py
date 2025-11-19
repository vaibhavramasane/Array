#5. Palindrome Number
#Description: Write a program to check if
# a number is a palindrome.
#Input: n = 121
#Output: Palindrome 

n = int(input("Enter Number: "))
temp = n;
rev =0;

while n!=0:
   
    rem = n % 10
    n = n//10
    rev = rev * 10 + rem
    

if temp == rev:
    
    print("it is a palinderome")
    
    
    
else :
    
    print("It is not a palindrome")
    
    
     
