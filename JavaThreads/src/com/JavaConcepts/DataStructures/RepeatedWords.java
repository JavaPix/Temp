package com.JavaConcepts.DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatedWords {

	public static void main(String[] args) throws IOException {
		/*System.out.println("Enter the string :");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] words = input.split(" ");
		
		Map<String, String> wordMap = new HashMap<String, String>();
		for(int i=0; i<words.length; i++){
			String word = words[i];
			if(wordMap.get(word)!=null){
				System.out.println("Duplicated word: "+word);
			}else{
				wordMap.put(word, word);
			}
		}*/
		
		
		
		/* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int N = Integer.parseInt(line);
	        for (int i = 0; i < N; i++) {
	        	String str = br.readLine();
				String[] strarr = str.split(" ");
				String user = strarr[0];
				String userVal = strarr[1];
				int ans = soln(user, userVal);
				if((userVal.length())!=(user.length()*2)){
					System.out.println("Impossible");
				}
				if(ans==2){
					System.out.println("Possible");
				}else{
					System.out.println("Impossible");
				}
	        }*/
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
        	String str = br.readLine();
			String[] strarr = str.split(" ");
			String user = strarr[0];
			String userVal = strarr[1];
			
			solution(user, userVal);
        }
		
	}
	
	public static void solution(String user, String userVal){
		for(int i=0; i<userVal.length(); i++){
			
		}
	}
	
	/*public static int soln(String user, String userVal){
			int i=0;
			Pattern p = Pattern.compile(user);
			Matcher m = p.matcher(userVal);
			while(m.find()){
				i++;
		}
		return i;
	}*/
}
