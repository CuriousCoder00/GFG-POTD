# Adding Ones - 11 June

class Solution:
    def update(self, a, n, updates, k):
        # Your code goes here
        temp = 0
        for i in range(k):
            a[updates[i]-1] += 1
    
        for i in range(n):
            a[i] += temp
            temp = a[i]

