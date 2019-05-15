public class BoardClass
{ 
	
    public static int X; 
	public static int Y;
	
	
	
    public static final int knightsXMoves[] = {2, 1, -1, -2, -2, -1, 1, 2}; 
    public static final int knightsYMoves[] = {1, 2, 2, 1, -1, -2, -2, -1};
	
    public BoardClass(int X, int Y) {

      this.X = X;
      this.Y = Y;
	
	  //boardsize

    }
	
	
	
    public RunData programIterationSpeed(int x, int y) 
		{  
			
			
			
			RunData iterationData = new RunData();
			
			iterationData.boardSize(X,Y);
			
			iterationData.initialPoint(x,y);
			
			iterationData.initialUsedMem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
			
			iterationData.startTime = System.nanoTime();
							
			iterationData.solnMatrix = programIteration(x,y); 
							
			iterationData.endTime = System.nanoTime();
			
			iterationData.finalUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
			
			return iterationData;
			
			
		//	System.out.println("total time: " + realTotalTime + " nano seconds");
		//	System.out.println("average time: " + realTotalTime/(X*Y) + " nano seconds");
		//	System.out.println();
		//	System.out.println("total memory used: " + actualMemUsed + " Bytes");
		//	System.out.println("average memory used: " + actualMemUsed/(X*Y) + " Bytes");
			
    	}
		
	public static int[][] programIteration(int i, int j)
	{
    	int knightsMoves[][] = new int[X][Y]; 

    	initializeArray(knightsMoves);

		int moveCount = 0;

   	 	knightsMoves[i][j] = moveCount; 
		moveCount++;


    	if (!recursionTool(i, j, moveCount, knightsMoves, knightsXMoves, knightsYMoves)) 

			{ 
       			return initializeArray(knightsMoves);
        		
    		}
		else
			{
	        	return knightsMoves;
			}
	}
	
	
	public static void printFunction(int knightsMoves[][])
		
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
  
	public static int[] warnsdorffAlgorithm(int x, int y, int knightsXMoves[], int knightsYMoves[], int knightsMoves[][])
	{
		
		int avalPrime[] = new int[8];
		
		for (int w = 0; w<8; w++)
				
			{
				if (availibility(x, y, knightsMoves))
						
					{
         				   
						int iPrime = knightsXMoves[w]+x;
						int jPrime = knightsYMoves[w]+y;	
							
	
						for(int t = 0; t<8;t++)
									
							{
								
								
								if (availibility(iPrime+knightsXMoves[t], jPrime+knightsYMoves[t], knightsMoves))
										
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
									
						if (avalPrime[counter]==0)
								
						{
							avalPrime[counter]=-1;
						}
								
										
					}
				
		return avalPrime;
		
		
	}
	
	
  	public static int[] customizedSort(int avalPrime[])
	{
		int optimumSequence[] = new int[8];
		
		int t=0;
		
		for(int i=0; i<8; i++)
			{
				if(avalPrime[i]==-1)
					{
						optimumSequence[7-t]=i;
						t++;
					}
					
			}

		for(int i=0; i<8; i++)
			{
				if(avalPrime[i]==8)
					{
						optimumSequence[7-t]=i;
							
					}
					
			}
			
		for(int i=0; i<8; i++)
			{
				if(avalPrime[i]==7)
					{
						optimumSequence[7-t]=i;
							
					}
					
			}
			
		for(int i=0; i<8; i++)
				{
					if(avalPrime[i]==6)
						{
							optimumSequence[7-t]=i;
							
						}
					
				}
				
		for(int i=0; i<8; i++)
				{
					if(avalPrime[i]==5)
						{
							optimumSequence[7-t]=i;
							
						}
					
				}
				
				
		for(int i=0; i<8; i++)
				{
					if(avalPrime[i]==4)
							{
									optimumSequence[7-t]=i;
							
							}
					
				}
				
				
				for(int i=0; i<8; i++)
						{
							if(avalPrime[i]==3)
								{
									optimumSequence[7-t]=i;
							
								}
					
						}
						
						for(int i=0; i<8; i++)
								{
									if(avalPrime[i]==2)
										{
											optimumSequence[7-t]=i;
							
										}
					
								}
			
								for(int i=0; i<8; i++)
										{
											if(avalPrime[i]==1)
												{
													optimumSequence[7-t]=i;
							
												}
					
										}
		
		
		
		return optimumSequence;
		
	}
	
  
    public static boolean recursionTool(int x, int y, int kCounter, int knightsMoves[][], int knightsXMoves[], int knightsYMoves[]) 
		{ 
        	int xMove;
			int yMove; 
        	
			if (kCounter == X * Y) 
				{
            		return true; 
				}
  			
			
		    
			int availibleMoveMatrix[] = warnsdorffAlgorithm(x, y, knightsXMoves, knightsYMoves, knightsMoves);
			
	
			int movePrioritization[] = customizedSort(availibleMoveMatrix);
			
			
        	for (int k = 0; k < 8; k++) 
				{ 
            		xMove = x + knightsXMoves[movePrioritization[k]]; 
            		yMove = y + knightsYMoves[movePrioritization[k]]; 
					
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