public class BoardGenerator {

	public static int[][] randomState(int heigth, int width) {
	
	int[][] board = new int[width][heigth];

	for(int i=0; i<heigth; i ++) 
	for(int x=0; x<width; x++){
    
	board[i][x]= (int) Math.round(Math.random());
	}
		return board;
	}
	
	public static int[][] deadState(int heigth, int width) {
		
		int[][] deadBoard = new int[width][heigth];

		for(int i=0; i<heigth; i ++) 
		for(int x=0; x<width; x++){
	    
			deadBoard[i][x]= 0;
		}
			return deadBoard;
		}
	
	
}
