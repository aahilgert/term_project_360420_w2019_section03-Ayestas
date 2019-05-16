public class BoardStatistics
{

	public int X;
	public int Y;
	public long sumTime;
	public long sumMem;
	public long totalRuns;
	
	public BoardStatistics(int X, int Y) // constructor, initiates boardsize
		{
		
			this.X=X;
			this.Y=Y;
		
			sumTime=0;
			sumMem=0;
	
		}
		
	public void addRunTotals(RunData x) //sums data from all succesful RunDatas of its boardsize
	{
		
		if(x.isSolved() && x.isCorrectRun())
		{
		sumTime+=x.getRunTime();
		sumMem+=x.getMemUsed();
		totalRuns++;
		}
		else
		{
			sumTime=sumTime;
			sumMem=sumMem;
		}
		
		
	}
		
	
	public int getBoardX() // returns board's X length
		{
		
			return X;
			
		}
	public int getBoardY() // returns board's Y length
		{
		
			return Y;
				
		}
		
	public long getSpaces() // returns total number of spaces on this board
	{
		
		return (long)X*Y;
	}
	
	public long getTotalTime() // returns total time for all iterations 
		
	{
		return sumTime;
		
	}
	
	public long getTotalMem() // returns total time for all iterations 
		
	{
		
		return sumMem;
		
	}
	
	public long getTotalRuns() // returns number of succesful runs 
		
	{
		
		return totalRuns;
		
	}
	
	public long getAverageMemUsed() // returns average memory used by each succesful run 
	
	{
		
		return sumMem/totalRuns;
		
	}

	public long getAverageRunTime() // returns average run time for each succesful run 
	
	{
		
		return sumTime/totalRuns;
		
	}
	
	public boolean isBoardValid() // returns true if board has a valid knight's tour
	{
		
		if(totalRuns==0)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}


}