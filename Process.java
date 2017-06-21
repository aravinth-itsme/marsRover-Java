class Process extends Rover
{
	public Process(){
		super();
	}
	
	public Process(int x, int y, String a, String d){
		super.x = x;
		super.y = y;
		super.direction = a;
		super.actions = d;
		
		for(int i=0; i < actions.length(); i++){
			analyzeRoverActions(actions.charAt(i));
		}		
		super.result();
	}
	
	void analyzeRoverActions(char c){
		String s = "" + c;
		switch(s){
			case "L":
				super.turnLeft(); break;
			case "R":
				super.turnRight(); break;
			case "M":
				super.move(); break;
		}
	}	
}