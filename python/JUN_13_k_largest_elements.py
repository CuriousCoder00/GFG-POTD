# k largest element - June 13

class Solution:
	def kLargest(self,arr, n, k):
		arr = sorted(arr,reverse=True)
		return arr[:k]