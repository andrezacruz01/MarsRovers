package br.com.zup;

public class Rover {
	public static final int N = 1;
	public static final int E = 2;
	public static final int S = 3;
	public static final int W = 4;
	
	int x = 0;
	int y = 0;
	
	int facing = N;

	public void setPosition(int x, int y, int facing){
		this.x = x;
		this.y = y;
		this.facing = facing;
	}
	
	public String printPosition(){
		char direction = 'N';
		
		if(facing == 1){
			direction = 'N';
		}else if(facing == 2){
			direction = 'E';
		}else if(facing == 3){
			direction = 'S';
		}else if(facing == 4){
			direction = 'W';
		}
		return x + " " + y + " " + direction; 
	}
	
	public void process(String commands){
		for (int idx = 0; idx < commands.length(); idx++) {
			process(commands.charAt(idx));
		}
	}
	
	private void process(Character command) {
		if (command.equals('L')) {
			turnLeft();
		} else if (command.equals('R')) {
			turnRight();
		} else if (command.equals('M')) {
			move();
		} else {
			throw new IllegalArgumentException("Illegal Argument Exception");
		}
	}
	 
	private void turnLeft(){
		facing = (facing - 1) < N ? W : facing - 1;
	}
	
	private void turnRight(){
		facing = (facing + 1) > W ? N :facing  + 1;
	}
	
	private void move(){
		if(facing == N){
			this.y++;
		}else if(facing == E){
			this.x++;
		}else if(facing == S){
			this.y--;
		}else if(facing == W){
			this.x--;
		}
	}
}
