#Loop through numbers and apply break and continue

for i in range(10):

	if i==5:
	
		print("Skipping 5")
		continue
	
	elif i==8:
	
		print("Stopping the loop")
		break
	
	print(i)
	