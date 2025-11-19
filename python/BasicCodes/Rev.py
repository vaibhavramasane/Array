#reverse



def reverse_number(n):
    return int(str(n)[::-1])
    
    
number = int(input("Enter Number: "))
reversed_num = reverse_number(number)
print(f"Reversed number: {reversed_num}")
    
