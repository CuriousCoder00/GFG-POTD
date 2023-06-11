// Adding Ones - 11 June

class Solution {
    public static void update(int a[], int n, int updates[], int k)
    {
        // Your code goes here
        int temp = 0;
        for(int i = 0; i < k; i++){
            a[updates[i]-1]+=1;
        }
        for(int i = 0; i < n; i++){
            a[i] += temp;
            temp = a[i];
        }
    }
}
