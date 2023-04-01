/* Number of ways to form Natural Number 
Find number of ways an integer N can be represented as a sum of unique natural numbers.*/

public static int num(int n , int s){
    if(n==0) return 1;

    int count=0;
    for(int i=s;i<=n;i++){
      count+=num(n-i,i+1);
    }
    return count;
