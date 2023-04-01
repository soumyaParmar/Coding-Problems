/*You are given an array arr of length n. You have to find the maximum element of the array.

Note

You have to use Recursion.
input - 
3
2 3 10
output - 10
*/

public static int maxElement(int[] arr){
      ans = max1(arr,0,arr.length);
		return ans;
    }
	public static int max1(int[] arr, int i, int n){
		if(n<1) return arr[0];
		return Math.max(arr[i],max1(arr,i+1,n-1));	
	}
