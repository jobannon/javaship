package battleship;

public class Main {
	public static void main(String[] args) {
		System.out.println("hi");
		Board computerBoard = new Board();
		Board playerBoard = new Board();
		
		Computer computer = new Computer(computerBoard);

		Ship computerCruiser = new Ship("Cruiser", 3);
		Ship computerSub = new Ship("Submarine", 2);

		Ship playerCruiser = Ship.new("Cruiser", 3);
		Ship playerSub = Ship.new("Submarine", 3);

		Round round = new Round(computerBoard, playerBoard, computer, computerCruiser, computerSub, playerCruiser, playerSub)
	}
	
}
