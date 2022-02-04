

public class Render {
	
	
  public static void  renderBoard(int[][] board) {

	  String[][] x = new String[board[0].length][board.length];
	 
	  for (int row = 0; row < board.length; row++) {
		    for (int col = 0; col < board.length; col++) {
		    
		    	
		    if(board[row][col] == 1) {
		    	x[row][col] = "#";
		    }
		    else {
		    	x[row][col] = "X";
		    }
		  
		    }
		    
		   
		 }
	  System.out.println("--------------------");	 print2D(x);
	}
  
  public static void print2D(String[][] matrix)
  {
	  for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
	         for (int j = 0; j < matrix[i].length; j++) { //this equals to the column in each row.
	            System.out.print(matrix[i][j] + " ");
	         }
	         System.out.println(); //change line on console as row comes to end in the matrix.
	      }
  }
	 
  }

