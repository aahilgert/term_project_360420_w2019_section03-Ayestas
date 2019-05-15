
class Analysis 
{
	
	public static void main(String[] args)
	
	{
		
		
		
		BoardClass fiveByFive = new BoardClass(5,5);
		
		BoardStatistics fiveByFiveStatistics = new BoardStatistics(5,5);
		
		
		
	        	for (int x = 0; x < 5; x++) 
					{ 
	            		for (int y = 0; y < 5; y++)
							{
								fiveByFiveStatistics.addRunTotals(fiveByFive.programIterationSpeed(x, y));
		 
							}
	            		
					}
		
		
		
	  
		
		System.out.println(fiveByFiveStatistics.getAverageMemUsed());
		
		System.out.println(fiveByFiveStatistics.getAverageRunTime());
		
		System.out.println(fiveByFiveStatistics.getSpaces());
		
		System.out.println(fiveByFiveStatistics.getTotalRuns());
		
		System.out.println(fiveByFiveStatistics.isBoardValid());
		
		
		
	/*	
	
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

	*/

















        
    }























}