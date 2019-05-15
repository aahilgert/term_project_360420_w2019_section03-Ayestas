public class BoardStatistics
{

	public int X;
	public int Y;
	public long sumTime;
	public long sumMem;
	public long totalRuns;
	
	public BoardStatistics(int X, int Y)
		{
		
			this.X=X;
			this.Y=Y;
		
			sumTime=0;
			sumMem=0;
	
		}
		
	public void addRunTotals(RunData x)
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
		
	
	public int getBoardX()
		{
		
			return X;
			
		}
	public int getBoardY()
		{
		
			return Y;
				
		}
		
	public int getSpaces()
	{
		
		return X*Y;
	}
	
	public long getTotalTime()
		
	{
		return sumTime;
		
	}
	
	public long getTotalMem()
		
	{
		
		return sumMem;
		
	}
	
	public long getTotalRuns()
		
	{
		
		return totalRuns;
		
	}
	
	public long getAverageMemUsed()
	
	{
		
		return sumMem/totalRuns;
		
	}

	public long getAverageRunTime()
	
	{
		
		return sumTime/totalRuns;
		
	}
	
	public boolean isBoardValid()
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