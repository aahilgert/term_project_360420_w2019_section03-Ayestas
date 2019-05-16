public class RunData
{
	public int X;
	public int Y;
	public int i;
	public int j;
	public long initialUsedMem;
	public long finalUsedMem;
	public long startTime;
	public long endTime;
	public int[][] solnMatrix;
	
	public void boardSize(int X, int Y) // initiates boardsize
	{
		this.X = X;
		this.Y = Y;
		
		
	}
	
	public void initialPoint(int i, int j) // initiates starting point 
	{
		this.i = i;
		this.j = j;
		
	}

	public void initialUsedMem(long initialUsedMem) // collects initial computer memory 
	{
		
		this.initialUsedMem = initialUsedMem;
		
	}
	
	public void finalUsedMem(long finalUsedMem) // collects final computer memory 
	{
		
		this.finalUsedMem = finalUsedMem;
		
	}

	public void startTime(long startTime) // collects start time 
	{
		
		this.startTime = startTime;
		
	}
	
	public void endTime(long endTime) // collects end time
	{
		
		this.endTime = endTime;
		
	}
	
	public void solnMatrix(int[][] solnMatrix) // stores solution matrix
	{
		
		this.solnMatrix = solnMatrix;
		
	}
	
	public int[][] getSolution() // returns solution matrix
	{
		
		return solnMatrix;
	}
	
	public long getRunTime() // calculates and returns run time for iteration
	{
		
		return endTime - startTime;
		// nanoseconds
	}
	
	public long getMemUsed() // calculates and returns memory used by iteration
	{
		
		return finalUsedMem - initialUsedMem;
		// bytes
	}
	
	public boolean isSolved() // returns true if the starting space has a valid knight's tour
	{
		
		for (int k=0; k < solnMatrix.length; k++)
		{
		for (int n=0; n < solnMatrix[k].length; n ++) 
			{ 
		            if (solnMatrix[k][n] == -1) 
					{ 
		                return false; 
		            } 
		    }
		}
			
		return true;
	
		
	}
	
	public int getBoardX() // returns board x length 
		{
		
			return X;
		
		}
	public int getBoardY() // returns board y length 
		{
		
			return Y;
				
		}
		
	public int getRunI() // returns knight's initial i position 
		{
		
			return i;
				
		}
	
	public int getRunJ()  // returns knight's initial j position 
		{
		
			return j;
				
		}
		
	public boolean isCorrectRun() // data validates if run is correct; completes run in reverse order, assuring that all moves are correct vectors and on the chess board 
		{
				final int knightsXMoves[] = {2, 1, -1, -2, -2, -1, 1, 2}; 
			    final int knightsYMoves[] = {1, 2, 2, 1, -1, -2, -2, -1};
				int tempI = i;
				int tempJ = j;
				
				
				for(int i=0; i<(X*Y-1); i++)
				{
					for(int w=0; w<8; w++)
				{
					if(knightsXMoves[w]+tempI >= 0 && knightsYMoves[w]+tempJ >= 0 && knightsXMoves[w]+tempI < X && knightsYMoves[w]+tempJ < Y)
						
					{
					if(solnMatrix[knightsXMoves[w]+tempI][knightsYMoves[w]+tempJ]==i+1)
					{
						tempI=knightsXMoves[w]+tempI;
						tempJ=knightsYMoves[w]+tempJ;
						w=8;
					}
					}
					else
					{
						if(w==7)
						{
							return false;
						}
					}
				}
				}
				return true;
		} 

}