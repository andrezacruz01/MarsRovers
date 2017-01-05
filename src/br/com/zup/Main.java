package br.com.zup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Rover rover = new Rover();
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		String input1;
		String input2;
		int x = 0;
		int y = 0;
		int direction = 0;
		
		System.out.println("Insert the position: ");
		input1 = scanner1.next();
		
		x = Character.getNumericValue(input1.charAt(0));	
		y = Character.getNumericValue(input1.charAt(1));
		
			if(input1.charAt(2) == 'N'){
				direction = 1;
			}else if(input1.charAt(2) == 'E'){
				direction = 2;
			}else if(input1.charAt(2) == 'S'){
				direction = 3;
			}else if(input1.charAt(2) == 'W'){
				direction = 4;
			}
			
		System.out.println("Insert the movements: ");
		input2 = scanner2.next();
		
		rover.setPosition(x, y, direction);
		rover.process(input2);
		System.out.println(rover.printPosition());
	}
}
