package com.JavaConcepts.DataStructures;

public class SmallSquare {

	public void solve(int n){
		int options = (int)Math.sqrt(n);
		System.out.println(solveUsingDP(n, options));
	}
	
	public int solveUsingDP(int n, int options){
		int MN[] = new int[n+1];
		MN[0]=0;
		int[] NUM = new int[options+1];
		for(int number=1; number<=n; number++){
			for(int j=0; j<=options; j++){
				NUM[j]=0;
			}
			
			for(int j=1; j<options; j++){
				if(j*j<=number){
					NUM[j]=MN[number-j*j]+1;
				}
			}
			
			MN[number]=-1;
			for(int j=1; j<NUM.length; j++){
				if(NUM[j]>0 && (MN[number]==-1 || MN[number]>NUM[j])){
					MN[number]=NUM[j];
				}
			}
		}
		return MN[n];
	}
	
	public static void main(String[] args) {
		int N = 12;
		SmallSquare s = new SmallSquare();
		s.solve(N);
	}
}
