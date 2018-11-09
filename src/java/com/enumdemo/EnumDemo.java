package java.com.enumdemo;

public class EnumDemo {
	
	public static void main(String[] args) {
		
		Directions dir= Directions.NORTH;
		
		if (dir==Directions.EAST) {
			System.out.println("Directions is East");
		}else if(dir==Directions.WEST) {
			System.out.println("Directions is West");
		}else if (dir==Directions.NORTH) {
			System.out.println("Directions is North");
		}
		else {
			System.out.println("Directions is South");
		}
		
		
	}

}


enum Directions{
	
	EAST,WEST,NORTH,SOUTH
}