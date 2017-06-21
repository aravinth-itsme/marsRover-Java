import java.util.Scanner;
import plateau.Plateau;

public class RoverMain extends Process
{
	public static void main(String ar[])
	{		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter Size of the Plateau: ");
		int px = sc.nextInt();
		int py = sc.nextInt();
		Plateau pl = new Plateau(px,py);
		
		System.out.println("Enter Initial position of the Rover: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		String direction = sc.next();
		
		System.out.println("Enter Rovers activity: ");
		String actions = sc.next();		
		Process p = new Process(x,y,direction,actions);		
	}
}