public class RunData
{

	public double initialUsedMem;
	public double finalUsedMem;
	public double startTime;
	public double endTime;
	public int[][] solnMatrix;

	public void initialUsedMem(double initialUsedMem)
	{
		
		this.initialUsedMem = initialUsedMem;
		
	}
	
	public void finalUsedMem(double finalUsedMem)
	{
		
		this.finalUsedMem = finalUsedMem;
		
	}

	public void startTime(double startTime)
	{
		
		this.startTime = startTime;
		
	}
	
	public void endTime(double endTime)
	{
		
		this.endTime = endTime;
		
	}
	
	public void solnMatrix(int[][] solnMatrix)
	{
		
		this.solnMatrix = solnMatrix;
		
	}
	
	public double runTime()
	{
		
		return endTime - startTime;
		// nanoseconds
	}
	
	public double memUsed()
	{
		
		return finalUsedMem - initialUsedMem;
		// bytes
	}
	
	public boolean isSolved()
	{
		
		return (solnMatrix[0][0]==-1) ? false : true;
		
	}
	

}