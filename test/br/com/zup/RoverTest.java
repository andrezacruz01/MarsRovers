package br.com.zup;

import junit.framework.TestCase;

public class RoverTest extends TestCase {

	public void testPrintPositionFacingNorth() {
		System.out.println("RoverTest: testPrintPositionFacingNorth()");
		
		Rover rover = new Rover();
	
		rover.facing = 1;
		rover.x = 5;
		rover.y =1;
		
		String resultadoEsperado = "5 1 N";
		
		assertEquals(resultadoEsperado, rover.printPosition());
	}
	
	public void testPrintPositionFacingEast() {
		System.out.println("RoverTest: testPrintPositionFacingEast()");
		
		Rover rover = new Rover();
	
		rover.facing = 2;
		rover.x = 5;
		rover.y =1;
		
		String resultadoEsperado = "5 1 E";
		
		assertEquals(resultadoEsperado, rover.printPosition());
	}
	
	public void testPrintPositionFacingSouth() {
		System.out.println("RoverTest: testPrintPositionFacingSouth()");
		
		Rover rover = new Rover();
	
		rover.facing = 3;
		rover.x = 5;
		rover.y =1;
		
		String resultadoEsperado = "5 1 S";
		
		assertEquals(resultadoEsperado, rover.printPosition());
	}
	
	public void testPrintPositionFacingWest() {
		System.out.println("RoverTest: testPrintPositionFacingWest()");
		
		Rover rover = new Rover();
	
		rover.facing = 4;
		rover.x = 5;
		rover.y =1;
		
		String resultadoEsperado = "5 1 W";
		
		assertEquals(resultadoEsperado, rover.printPosition());
	}

}
