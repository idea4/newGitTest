
public class arrays3 {

	public static void main(String[] args) {
		
int [][] grid = {{4,5,6,7},    /// we don't need to say how long it is
				{ 2,4},
				{3,4}};
		
		/// so we cant actually just grid.length, has to be printed or used as a parameter 
		
		for(int row =0; row<grid.length; ++row) { 
			for (int col =0; col<grid[row].length; col++) {      /// so the col is incrasing whike row is zero, zero row is the top line and has length of 4 
			System.out.print(grid[row] [col] +"\t" );
			}
			
			System.out.println();
		}
	
	
	
	
	}
	
	
	
	
	

}
