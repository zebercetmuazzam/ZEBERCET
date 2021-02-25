package alistirmalar; 

import java.util.Scanner;

public class Odev2 {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
//		Odev2.alistirma01();
//		Odev2.alistirma02();
		Odev2.alistirma03();

		
		
	
		
	}

	public static void alistirma01() {
		
		System.out.println("Fahreneit value = ");
		int firstValue = scan.nextInt();
		
		System.out.println("Result = " + (5*(firstValue - 32)/9) +  " C");
		
		
		
	}
	
	public static void alistirma02() {
		
		System.out.println("Inch value = ");
		double firstValue = scan.nextDouble();
		
		System.out.println("Result = " + (firstValue * 0.0254) +  " m");
		
		
		
	}
	
	public static void alistirma03() {
		
		System.out.println("Input a integer between 0 and 1000 = ");
		String num = scan.next();
		int sum = 0;
		
		
		
		
		for (int i = 0; i < num.length(); i++) {
			
			sum = sum + Integer.parseInt(num.substring(i,i+1));
			
			
		}
			
				
			
			System.out.println(sum);

			
		}
		
			
		
	
		
		
}
	
	
