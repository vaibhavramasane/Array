n1 = int(input("Enter Physics Marks: "));
n2 = int(input("Enter Chemistry marks: "));
n3 = int(input("Enter Biology marks: "));
n4 = int(input("Enter Mathermatics: "));
n5 = int(input("Enter Computer: "));

total = n1 + n2 + n3 + n4 +n5;
print("Total Marks: ",total);
per = total/5;
print("Percentage: ",per);

if(per>=90):
    print("Grade A");
elif(per>=80):
    print("Grade B");
elif(per>=70):
    print("Grade C");
elif(per>=60):
    print("Grade D");
elif(per>=40):
    print("Grade E");
else:
    print("Grade F");
    

