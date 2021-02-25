package alistirmalar;


import java.util.Random;

public class Temp {

	public static void main(String[] args) {

		String s = "onur";
		
		int index = 3;
		
		System.out.println(s.charAt(s.length()-1-index));
		
		int[] indexes = new int[15];
		Random rn = new Random();
		
		
		for (int i = 0; i < indexes.length; i++) {
			indexes[i] = rn.nextInt(100);
					
		}
		
		String[] strX = {"tarik","egtan","onur","ayse"};
		
		

	
		
		System.out.println(indexes[5]);
				
		System.out.println(strX[1].length());
			

	}

}
