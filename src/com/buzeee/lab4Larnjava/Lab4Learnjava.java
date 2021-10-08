package com.buzeee.lab4Larnjava;

public class Lab4Learnjava {
	public static void main(String[] arges) {
		checkscore();
	}
	public static void checkscore() {
		boolean ISHandSome = false;
		int score = 65;
		if(score>=80) {
			if(ISHandSome == true) {
				System.out.println("Good");
			}else {
				System.out.println("Good");
			}
		}else if(score >= 50 && score<=80)
		{
			if(ISHandSome == true) {
				System.out.println("Good");
			}else {
				System.out.println("normal");
			}
		}else if(score < 50) {
			if(ISHandSome == true) {
				System.out.println("Good");
			}else {
				System.out.println("fail");
			}
		}
		
	}
}
