import java.util.ArrayList;


public class GameBoard {
	 ArrayList<CellNr> cells = new ArrayList<>();

	 public void generateCells() {
	 for(int i = 0; i <= 500 ; i ++){
		 
		for (int j = 0; j <= 500; j ++){
			cells.add(new CellNr(i,j));
	 }

		System.out.println();
}


	 }
}
	