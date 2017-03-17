def Equilibrium(A):
	sum_all = 0
	Rsum = 0
	Lsum = 0
	n = len(A)

	for (i,v) in enumerate(A):
		sum_all += A[i]
	for (j,w) in enumerate(A):
		Rsum = sum_all - Lsum - A[j]
		if Rsum == Lsum:
			print j
			return j
		Lsum += A[j]

	print -1
	return -1

# Tests
A = [1, 2, 3, 1, 6]
Equilibrium(A)
A = [1, 2, 3, 1, 6, 7, 2]
Equilibrium(A)





























