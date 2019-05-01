class RealKnightsTour 
{ 
	
    public static final int X = 5; 
	public static final int Y = 5;
    public static final int knightsXMoves[] = {2, 1, -1, -2, -2, -1, 1, 2}; 
    public static final int knightsYMoves[] = {1, 2, 2, 1, -1, -2, -2, -1};
	public static int i = 2;
	public static int j = 2;
	
	
	
    public static void main(String args[]) 
		{  
			
			long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
			
			long totalStartTime = System.nanoTime();
			
        	for (int x = 0; x < X; x++) 
				{ 
            		for (int y = 0; y < Y; y++)
						{
							long startTime = System.nanoTime();
							
							program(x,y); 
							
							long endTime   = System.nanoTime();
							long totalTime = endTime - startTime;
							System.out.println("iteration time: " + totalTime + " nano seconds");
							System.out.println();
							
							
						}
				}
			long totalEndTime   = System.nanoTime();
			long realTotalTime = totalEndTime - totalStartTime;
			
			long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
			long actualMemUsed=afterUsedMem-beforeUsedMem;
			
			
			System.out.println("total time: " + realTotalTime + " nano seconds");
			System.out.println("average time: " + realTotalTime/(X*Y) + " nano seconds");
			System.out.println();
			System.out.println("total memory used: " + actualMemUsed + " Bytes");
			System.out.println("average memory used: " + actualMemUsed/(X*Y) + " Bytes");
    	}
		
	public static void program(int i, int j)
	{
    	int knightsMoves[][] = new int[X][Y]; 

    	initializeArray(knightsMoves);

		int moveCount = 0;

   	 	knightsMoves[i][j] = moveCount; 
		moveCount++;


    	if (!recursionTool(i, j, moveCount, knightsMoves, knightsXMoves, knightsYMoves)) 

			{ 
       			System.out.println("DNE");
				System.out.println();
        		
    		}
		else
			{
	        	for (int x = 0; x < X; x++) 
					{ 
	            		for (int y = 0; y < Y; y++)
							{
	                			System.out.print(knightsMoves[x][y] + "|"); 
							}
	            		System.out.println(); 
					}
				System.out.println();
			}
	}
	
 
    public static boolean availibility(int x, int y, int knightsMoves[][])
		{ 
        	return (x >= 0 && y >= 0 && x < X && y < Y && knightsMoves[x][y] == -1);
    	} 
  	  		
     
	public static int[][] initializeArray(int knightsMoves[][])
		{
    		for (int x = 0; x < X; x++) 
				{
        			for (int y = 0; y < Y; y++) 
						{
							knightsMoves[x][y] = -1;
						}
					}
			return knightsMoves;
		}
  
	
  
    public static boolean recursionTool(int x, int y, int kCounter, int knightsMoves[][], int knightsXMoves[], int knightsYMoves[]) 
		{ 
        	int xMove;
			int yMove; 
        	
			if (kCounter == X * Y) 
				{
            		return true; 
				}
  			
			int avalPrime[] = new int[8];
			
			int movePrioritization[] = new int[8];
			
			for 
				
				avalPrime[]
		    
			for (int w = 0; w<8; w++)
					
				{
					if (availibility(x, y, knightsMoves))
							
						{
             				   
							int iPrime = knightsXMoves[w]+x;
							int jPrime = knightsYMoves[w]+y;	
								
		
							for(int t = 0; t<8;t++)
										
								{
									if (availibility(iPrime, jPrime, knightsMoves))
											
										{
											avalPrime[w]++;

										}
								}
												
											
						}
							
					else
						{
							avalPrime[w]=-1;
						}	
				}
			
			
			for (int counter = 0; counter < 8; counter++)
					
					{
									
						if (avalPrime[counter]=0)
								
						{
							avalPrime[counter]=-1;
						}
								
										
					}
					
			int temp
					
			for (int i = 0; i <  - 1; i++)
				{
					for(int j = 0; j <  - 1; j++)
					 {
					    if(numbers[i][] < numbers[j + 1])
					    {
					      temp = numbers [j + 1];
					      numbers [j + 1]= numbers [i];
					      numbers [i] = temp;
						  numbers 
					    }
					  }
					}
			
					// trying to impliment heuristic here code doesnt work because of this edit 
			
			
        	for (int k = 0; k < 8; k++) 
				{ 
            		xMove = x + knightsXMoves[k]; 
            		yMove = y + knightsYMoves[k]; 
					
            			if (availibility(xMove, yMove, knightsMoves)) 
							{ 
                				knightsMoves[xMove][yMove] = kCounter; 
								
								
                				if (recursionTool(xMove, yMove, kCounter + 1, knightsMoves, knightsXMoves, knightsYMoves)) 
						
                    				{
										return true; 
									}
                				else
									{
                   		 				knightsMoves[xMove][yMove] = -1;
									} 
            				} 
        		} 
  
        	return false; 
    	} 
  
}  