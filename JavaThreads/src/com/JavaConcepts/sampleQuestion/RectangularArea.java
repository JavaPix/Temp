package com.JavaConcepts.sampleQuestion;

public class RectangularArea {

	public static void main(String[] args) {
		int result = computeArea(5,6,3,2,9,1,8,7);
		System.out.println(result);
	}
	
	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H){
		if(C<E||G<A)
			return (G-E)*(H-F) + (C-A)*(D-B);
		
		if(D<F || H<B)
			return (G-E)*(H-F) + (C-A)*(D-B);
		
		int right = Math.min(C, G);
		System.out.println(right);
		int left = Math.max(A, E);
		System.out.println(left);
		int top = Math.min(H, D);
		System.out.println(top);
		int bottom = Math.max(F, B);
		System.out.println(bottom);
		
		return (G-E)*(H-F) + (C-A)*(D-B) - (right-left)*(top-bottom);
		
	}
}
