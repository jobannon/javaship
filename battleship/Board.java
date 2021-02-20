package battleship;

import java.util.HashMap;

public class Board {

		HashMap<String, Object> cells = new HashMap<String, Object>(){{
      put("A1", new Cell("A1"));
      put("A2", new Cell("A2"));
      put("A3", new Cell("A3"));
      put("A4", new Cell("A4"));
      put("B1", new Cell("B1"));
      put("B2", new Cell("B2"));
      put("B3", new Cell("B3"));
      put("B4", new Cell("B4"));
      put("C1", new Cell("C1"));
      put("C2", new Cell("C2"));
      put("C3", new Cell("C3"));
      put("C4", new Cell("C4"));
      put("D1", new Cell("D1"));
      put("D2", new Cell("D2"));
      put("D3", new Cell("D3"));
      put("D4", new Cell("D4"));
		}};
	public String cells;
	public String getCells(){
		return cells;
	
}
