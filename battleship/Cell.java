package battleship;
class Cell {

		private boolean firedAt = false; 
		Ship ship = new Ship();
	// constructor
	Cell(){

	}
	// attr_readers methods
	int getCoordinate(){
		return 0;
	};
	Ship getShip(){
		return this.ship;

	}
	boolean getFiredAt(){
		return this.firedAt;
	}


}
