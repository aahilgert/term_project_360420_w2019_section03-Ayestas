

class Analysis 
{
	
	public static void main(String[] args)
	
	{
		
		
		
		BoardClass sixBySix = new BoardClass(6,6);
		
		int[][] solnMatrix = sixBySix.programIteration(1,1);
		
		BoardClass.printFunction(solnMatrix);
		
		
		
		
	
    String filename = "AnalysisOutput.txt";
    PrintWriter outputFile = null;
    try
    {
        outputFile = new PrintWriter(new FileOutputStream(filename,false));
    }
    catch(FileNotFoundException e)
    {
        System.out.println("File error.  Program aborted.");
        System.exit(0);
    }



















        
    }























}