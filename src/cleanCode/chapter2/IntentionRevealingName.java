package cleanCode.chapter2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntentionRevealingName {

	private void nameOfVariable() {
		int d; // elapsed time in days
		
		int elapsedTimeInDays;
		int daysSinceCreation;
		int daysSinceModification;
		int fileAgeInDays;
	}
	
	public List<int[]> getThem(){
		List<int[]> list1 = new ArrayList<int[]>();
		for (int[] x : theList) {
			if(x[0] == 4) {
				list1.add(x);
			}
		}
		return list1;
	}
	
	public List<Cell> getFlaggedCells() {
		List<Cell> flaggedCells = new ArrayList<Cell>();
		for (Cell cell : gameBoard) {
			if (cell.isFlagged()) {
				flaggedCells.add(cell);
			}
		}
		return flaggedCells;
		}
	
	public List<int[]> getFlaggedCells(){
		List<int[]> flaggedCells = new ArrayList<int[]>();
		for(int[] cell : gameBoard) {
			if(cell[STATUS_VALUE] == FLAGGED) {
				flaggedCells.add(cell);
			}
		}
		return flaggedCells;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
