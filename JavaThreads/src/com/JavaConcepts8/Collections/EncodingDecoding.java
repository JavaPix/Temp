package com.JavaConcepts8.Collections;

import java.util.Base64;

public class EncodingDecoding {

	public static void main(String[] args) {
		Base64.Encoder encoder = Base64.getEncoder();
		byte[] byteArr1 = {1,2};
		byte[] byteArr2 = encoder.encode(byteArr1);
		System.out.println("Encoded byte Array: "+byteArr2);
		byte[] byteArr3 = new byte[10];
		int val = encoder.encode(byteArr1,byteArr3);
		System.out.println("Encoded byte array written to another array: "+byteArr3);
		System.out.println("Number of bytes written: "+val);
		
		String str = encoder.encodeToString("Nagarjun".getBytes());
		System.out.println("Encoded string: "+str);
		
		Base64.Decoder decoder = Base64.getDecoder();
		String dStr = new String(decoder.decode(str));
		System.out.println("Decoded String: "+dStr);
	}
}
