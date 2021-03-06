package com.JavaConcepts.sampleQuestion;

import java.util.LinkedList;
import java.util.Stack;

public class SimplifyPathVariables {
	
	public static void main(String[] args) {
		String path = "/home//foo/";
		String result = new SimplifyPathVariables().simplifyPath(path);
		System.out.println(result);
	}

	public String simplifyPath(String path){
		Stack<String> stack = new Stack<String>();
		
		while(path.length()>0 && path.charAt(path.length()-1)=='/'){
			path = path.substring(0,path.length()-1);
		}
		
		int start =0;
		for(int i=0; i<path.length();i++){
			if(path.charAt(i)=='/'){
				stack.push(path.substring(start,i));
				start = i;
			}else if(i==path.length()-1){
				stack.push(path.substring(start));
			}
		}
		
		LinkedList<String> result = new LinkedList<String>();
		int back = 0;
		while(!stack.isEmpty()){
			String top = stack.pop();
			
			if(top.equals("/.")||top.equals("/")){
				
			}else if(top.equals("/..")){
				back++;
			}else{
				if(back>0){
					back--;
				}else{
					result.push(top);
				}
			}
		}
		
		if(result.isEmpty()){
			return "/";
		}
		
		StringBuilder sb = new StringBuilder();
		while(!result.isEmpty()){
			String s = result.pop();
			sb.append(s);
		}
		
		return sb.toString();
	}
}
