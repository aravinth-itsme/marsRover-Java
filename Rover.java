import java.util.*;
import plateau.Plateau;

public class Rover
{
	public static int x = 0, y = 0;
	public static String direction = "";
	public static String actions = "";
	public static int CurrentDirection = 0;
	
	String a[] = {"N","E","S","W"};
	
	void findDirection(){
		Map<Integer, String> dir = new HashMap<Integer, String>();	
		dir.put(1,"N");
		dir.put(2,"E");
		dir.put(3,"S");
		dir.put(4,"W");
		
		for(Map.Entry<Integer, String> entry  : dir.entrySet()){
			if(entry.getValue().equals(direction))
			CurrentDirection = entry.getKey(); 
			if(entry.getValue().equals(direction))
				CurrentDirection = entry.getKey();
			if(entry.getValue().equals(direction))
				CurrentDirection = entry.getKey();
			if(entry.getValue().equals(direction))
				CurrentDirection = entry.getKey();
		}
	}
	
	void turnLeft(){
		findDirection();
		CurrentDirection = (CurrentDirection == 1 ) ? 4 : (CurrentDirection - 1);
		direction = a[CurrentDirection-1];
	}
	
	void turnRight(){
		findDirection();
		CurrentDirection = (CurrentDirection == 4 ) ? 1 : (CurrentDirection + 1);
		direction = a[CurrentDirection-1];
	}
	
	void move(){
		findDirection();
		if(CurrentDirection == 1) // N
			y++;
		if(CurrentDirection == 2) // E
			x++;
		if(CurrentDirection == 3) // S
			y--;
		if(CurrentDirection == 4) // W
			x--;		
	}	
	
	void result(){
		if(x <= Plateau.px && y <= Plateau.py)
			System.out.println("Final Position: "+ x + " " + y + " " + direction);
		else
			System.out.println("Rover exceeds the size of the plateau.");
	}	
}