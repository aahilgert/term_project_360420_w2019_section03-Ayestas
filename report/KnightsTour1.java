import java.util.Scanner;

public class KnightsTour1
	{
		
		
		
		//knights valid moves
		public static final int[] knightsXMoves = {2,1,-1,-2,-2,-1,1,2};
		public static final int[] knightsYMoves = {1,2,2,1,-1,-2,-2,-1};

			
		
		
		
		
		public static void main (String[] args)  
			{
				Scanner keyboard = new Scanner(System.in);
				
				System.out.println("please enter your knight's starting x chordinate");
				int i = keyboard.nextInt();
				System.out.println("please enter your knight's starting y chordinate");
				int j = keyboard.nextInt();
				System.out.println("please enter your board's x dimention");
				int x = keyboard.nextInt();
				System.out.println("please enter your board's y dimention");
				int y = keyboard.nextInt();
				
				//crosses off visited spots
				boolean[][] spotTaken = new boolean [x][y];
				
				for(int q = 0; q < x; q++)
					{
						for(int a = 0; a < y; a++)  
				        {
							spotTaken[q][a] = true;
						}
					}
					
				spotTaken[i-1][j-1] = false;
				
				int[] avalPrime = new int [8];
				boolean[] avalPrime = new boolean [8];
					
				//solution matrix	
				int[][] knightsMoves = new int [x][y];
				
				int min = 7;
				int maxMoves = x*y-1;
				int moveCounter = 1;
				
				int[] moveMemory = new int [maxMoves];
				
		
				while(moveCounter<(maxMoves - 1))
					{
						
						for(int w = 0; w<8;w++)
							
							{
								if (((knightsXMoves[w]+i)>0) && ((knightsYMoves[w]+j)>0) && ((knightsXMoves[w]+i)<=x) && ((knightsYMoves[w]+j)<=y) && (spotTaken[knightsXMoves[w]+i-1][knightsYMoves[w]+j-1]))
									
									{
	                 				   
										int iPrime = knightsXMoves[w]+i;
										int jPrime = knightsYMoves[w]+j;	
										
				
											for(int t = 0; t<8;t++)
												
												{
													if (((knightsXMoves[t]+iPrime)>0) && ((knightsYMoves[t]+jPrime)>0) && ((knightsXMoves[t]+iPrime)<=x) && ((knightsYMoves[t]+jPrime)<=y) && (spotTaken[knightsXMoves[t]+iPrime-1][knightsYMoves[t]+jPrime-1]))
														{
															avalPrime[w]++;
															avalPrimeValid[w]=true;
														}
												}
														
													
									}
									
								else
									{
										avalPrime[w]=0;
										avalPrimeValid[]=false;
									}	
							}
								
						for (int counter = 0; counter < 8; counter++)
							
								{
											
									if (avalPrime[counter] < min && avalPrime[counter] > 0)
										
										  {
										      min = counter;
										  }
												
								}
						
							    
						
						i = knightsXMoves[min]+i;
						j = knightsYMoves[min]+j;
						moveMemory[moveCounter-1]=min;
						spotTaken[i-1][j-1] = false;
						knightsMoves[i-1][j-1] = moveCounter;
					
						moveCounter++;
						min = 7;
					  
						for(int l = 0; l < 8; l++)  
				        	{
								avalPrime[l] = 0;
							}
					
						
					}
					
					for(int w = 0; w<8;w++)
						{
							if (((knightsXMoves[w]+i)>0) && ((knightsYMoves[w]+j)>0) && ((knightsXMoves[w]+i)<=x) && ((knightsYMoves[w]+j)<=y) && (spotTaken[knightsXMoves[w]+i-1][knightsYMoves[w]+j-1]))
								{
									
									i = knightsXMoves[w]+i;
									j = knightsYMoves[w]+j;
									spotTaken[i-1][j-1]=false;
									knightsMoves[i-1][j-1] = moveCounter;
									moveCounter++;
									w=8;
								
								}
				
						}
			
										
					for(int z = 0; z<x; z++)
						{
							System.out.print("|");
					    	for(int c = 0; c<y; c++)
					    		{
					       	 		System.out.print(knightsMoves[z][c]);
									System.out.print("|");
					    		}
					    	System.out.println();
						}
				
					
			}
	}