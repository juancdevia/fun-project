
public class NextBoardState {
	
	private int[][] randomBoard = null;

	private int[][] GetRandomState() {
		this.randomBoard =	BoardGenerator.randomState(10, 10);
     return randomBoard;
	}
	
	//Setting the rules
   public void GameRules(){
	
	//Getting random Board
	   this.randomBoard = GetRandomState();
	
	
	   //looping thru board
	   for (int row = 0; row < randomBoard.length; row++) {
		    for (int col = 0; col < randomBoard.length; col++) {
	
		    	
     //Rule 1
    //Any live cell with 0 or 1 live neighbors becomes dead, 
	//because of underpopulation
		    	
		    	
    //checking number for live neighbors 
		    	int alliveNeighbors = 0;
		    	  //looping thru board
		 	   for (int i = -1; i < 1; i++) {
		 		    for (int x = 0; x < 1; x++) {
		 		    	alliveNeighbors  = randomBoard[row + i][col + x];   	
		 		    } }
		 	
		
	}
}
   }
}

