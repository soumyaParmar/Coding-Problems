/*You are given n coins of various denominations. Along with that you are also given amount amt.

You are required to calculate and print the permutations of the n coins (non-duplicate) using which the amount amt can be paid.

Note:

Print all the permutations following the order in which the coins are present.

Use the code snippet and follow the algorithm discussed in the question video. The judge can't force you, but the intention is to teach a concept. Play in the spirit of the question.*/


private static void print(int[] coins, int amt, int count_amt,String p_amt,boolean[] visited){
		if(count_amt > amt){
			return;
		}
		if(count_amt == amt){
			System.out.println(p_amt+" ");
			return;
		}
		for(int i=0;i<coins.length;i++){
			if(visited[i]==false){
				visited[i]=true;
				print(coins, amt, count_amt+coins[i], p_amt + coins[i]+" ", visited);
				visited[i]=false;
			}
		}
	}
 public static void coinChange(int[] coins, int amt){
		boolean[] visited = new boolean[coins.length];
		int count_amt = 0;
		String print_amt = "";
        print(coins,amt,count_amt,print_amt,visited);
  }
