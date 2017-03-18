def solution(N):
	BinArray = []
	Array = []
	flag = 0
	counter=0
	## convert N to binary
	while not N==0:
		if N%2==0:
			BinArray.append(0)
		else:
			BinArray.append(1)
		
		N = N/2 ## update N
	## reverse BinArray
	BinArray.reverse()
	
	## counter for the gap
	for i in BinArray:
		if i==1:
			if flag==0:
				flag=1
			else:
				Array.append(counter)
				counter=0
		else:
			if flag==1:
				counter=counter+1
	## return
	return max(Array)
