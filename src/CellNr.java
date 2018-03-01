
// This is to keep track of the cells and it's numbers
public class CellNr {

	private int colOfCellNr;
	private int rowOfCellNr;
	
	CellNr(int x, int y){
		colOfCellNr = x;
		rowOfCellNr = y;
	}
	public int getCol(){
		return colOfCellNr;
	}
	public int getRow(){
		return rowOfCellNr;
	}
    }
