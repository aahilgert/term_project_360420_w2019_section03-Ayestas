class SameersTestAnalysis 
{
	// with the running of this code, the final data matrix will be shown in the terminal
	// this matrix contains average memory (in bytes) per run on each sized board on the first line
	// average time per run (in nanoseconds) on each sized board on the first line
	// number of squares on the referred to chessboard on the third line
	
	public static void main(String[] args)
	
	{
		
		//initialization of differently sized chessboards
		
		BoardClass fiveByFive = new BoardClass(5,5);
		
		/*
		BoardClass fiveBySix = new BoardClass(5,6);
		
		BoardClass sixBySix = new BoardClass(6,6);
		
		BoardClass sixBySeven = new BoardClass(6,7);
		
		BoardClass sixByEight = new BoardClass(6,8);
		
		BoardClass sevenBySeven = new BoardClass(7,7);
		
		BoardClass sevenByEight = new BoardClass(7,8);
		
		BoardClass eightByEight = new BoardClass(8,8);
		
		BoardClass eightByNine = new BoardClass(8,9);
		
		BoardClass nineByNine = new BoardClass(9,9);
		
		BoardClass nineByTen = new BoardClass(9,10);
		
		BoardClass tenByTen = new BoardClass(10,10);
		
		*/
		System.out.println("done with class initialization");
		
		//initialization of run statistics for each chessboard
		
		BoardStatistics fiveByFiveStatistics = new BoardStatistics(5,5);
		/*
		BoardStatistics fiveBySixStatistics = new BoardStatistics(5,6);
		
		BoardStatistics sixBySixStatistics = new BoardStatistics(6,6);
		
		BoardStatistics sixBySevenStatistics = new BoardStatistics(6,7);
		
		BoardStatistics sixByEightStatistics = new BoardStatistics(6,8);
		
		BoardStatistics sevenBySevenStatistics = new BoardStatistics(7,7);
		
		BoardStatistics sevenByEightStatistics = new BoardStatistics(7,8);
		
		BoardStatistics eightByEightStatistics = new BoardStatistics(8,8);
		
		BoardStatistics eightByNineStatistics = new BoardStatistics(8,9);
		
		BoardStatistics nineByNineStatistics = new BoardStatistics(9,9);
		
		BoardStatistics nineByTenStatistics = new BoardStatistics(9,10);
		
		BoardStatistics tenByTenStatistics = new BoardStatistics(10,10);
		*/
			
		System.out.println("done with statistics initialization");
		
	   	// running of knight's tour solving at each starting square and storing of run data for each board
						
	 	for (int x = 0; x < fiveByFiveStatistics.getBoardX(); x++) 
				{ 
					   for (int y = 0; y < fiveByFiveStatistics.getBoardY(); y++)
							{
								
								fiveByFiveStatistics.addRunTotals(fiveByFive.programIterationSpeed(x, y));
	
							}
	            		
				}
				
			System.out.println("done five by five");
			
			/*

		for (int x = 0; x < fiveBySixStatistics.getBoardX(); x++) 
					{
						
						for (int y = 0; y < fiveBySixStatistics.getBoardY(); y++)
							{
								
								fiveBySixStatistics.addRunTotals(fiveBySix.programIterationSpeed(x, y));
		 
							}
	            		
					}
					
			System.out.println("done five by six");		
		

		for (int x = 0; x < sixBySixStatistics.getBoardX(); x++) 
				{ 
						for (int y = 0; y < sixBySixStatistics.getBoardY(); y++)
								{
								
									sixBySixStatistics.addRunTotals(sixBySix.programIterationSpeed(x, y));
		 						   
								}
	            		
				}
			
			System.out.println("done six by six");	
		
				
		for (int x = 0; x < sixBySevenStatistics.getBoardX(); x++) 
			{ 
				for (int y = 0; y < sixBySevenStatistics.getBoardY(); y++)
						{
								
							sixBySevenStatistics.addRunTotals(sixBySeven.programIterationSpeed(x, y));
		 
						}
	            		
			}
			
			System.out.println("done six by seven");
			
		for (int x = 0; x < sixByEightStatistics.getBoardX(); x++) 
			{ 
				for (int y = 0; y < sixByEightStatistics.getBoardY(); y++)
						{
								
							sixByEightStatistics.addRunTotals(sixByEight.programIterationSpeed(x, y));
		 
						}
	            		
			}
			
			System.out.println("done six by eight");
			
		for (int x = 0; x < sevenBySevenStatistics.getBoardX(); x++) 
			{ 
				for (int y = 0; y < sevenBySevenStatistics.getBoardY(); y++)
					{
								
						sevenBySevenStatistics.addRunTotals(sevenBySeven.programIterationSpeed(x, y));
		 
					}
	            		
			}
			
			System.out.println("done seven by seven");
			
		for (int x = 0; x < sevenByEightStatistics.getBoardX(); x++) 
			{ 
				for (int y = 0; y < sevenByEightStatistics.getBoardY(); y++)
					{
								
						sevenByEightStatistics.addRunTotals(sevenByEight.programIterationSpeed(x, y));
		 
					}
	        }
			
			System.out.println("done seven by eight");
																						
		for (int x = 0; x < eightByEightStatistics.getBoardX(); x++) 
			{ 
				 for (int y = 0; y < eightByEightStatistics.getBoardY(); y++)
						{
								
								eightByEightStatistics.addRunTotals(eightByEight.programIterationSpeed(x, y));
		 
						}
	            		
			}
			
			System.out.println("done eight by eight");
			
		for (int x = 0; x < eightByNineStatistics.getBoardX(); x++) 
				{ 
						for (int y = 0; y < eightByNineStatistics.getBoardY(); y++)
								{
								
									eightByNineStatistics.addRunTotals(eightByNine.programIterationSpeed(x, y));
		 
								}
	            		
				}
				
			System.out.println("done eight by nine");
			
		for (int x = 0; x < nineByNineStatistics.getBoardX(); x++) 
			{ 
				for (int y = 0; y < nineByNineStatistics.getBoardY(); y++)
					{
								
							nineByNineStatistics.addRunTotals(nineByNine.programIterationSpeed(x, y));
		 
					}
	            		
			}
			
			System.out.println("done nine by nine");
			
		for (int x = 0; x < nineByTenStatistics.getBoardX(); x++) 
			{ 
				for (int y = 0; y < nineByTenStatistics.getBoardY(); y++)
						{
								
							nineByTenStatistics.addRunTotals(nineByTen.programIterationSpeed(x, y));
		 
						}
	            		
			}
			
			System.out.println("done nine by ten");
			
		for (int x = 0; x < tenByTenStatistics.getBoardX(); x++) 
				{ 
					for (int y = 0; y < tenByTenStatistics.getBoardY(); y++)
							{
								
								tenByTenStatistics.addRunTotals(tenByTen.programIterationSpeed(x, y));
		 
							}
	            		
				}

		System.out.println("done ten by ten");
		*/
		// final data matrix
		
		
		long[][] data = new long[3][1];
		
		//collecting of average memory used per run data
		
		data[0][0]=fiveByFiveStatistics.getAverageMemUsed();/*
		data[0][1]=fiveBySixStatistics.getAverageMemUsed();
		data[0][2]=sixBySixStatistics.getAverageMemUsed();
		data[0][3]=sixBySevenStatistics.getAverageMemUsed();
		data[0][4]=sixByEightStatistics.getAverageMemUsed();
		data[0][5]=sevenBySevenStatistics.getAverageMemUsed();
		data[0][6]=sevenByEightStatistics.getAverageMemUsed();
		data[0][7]=eightByEightStatistics.getAverageMemUsed();
		data[0][8]=eightByNineStatistics.getAverageMemUsed();
		data[0][9]=nineByNineStatistics.getAverageMemUsed();
		data[0][10]=nineByTenStatistics.getAverageMemUsed();
		data[0][11]=tenByTenStatistics.getAverageMemUsed();
		*/
		//collecting of average time taken per run data
	
		data[1][0]=fiveByFiveStatistics.getAverageRunTime();/*
		data[1][1]=fiveBySixStatistics.getAverageRunTime();
		data[1][2]=sixBySixStatistics.getAverageRunTime();
		data[1][3]=sixBySevenStatistics.getAverageRunTime();
		data[1][4]=sixByEightStatistics.getAverageRunTime();
		data[1][5]=sevenBySevenStatistics.getAverageRunTime();
		data[1][6]=sevenByEightStatistics.getAverageRunTime();
		data[1][7]=eightByEightStatistics.getAverageRunTime();
		data[1][8]=eightByNineStatistics.getAverageRunTime();
		data[1][9]=nineByNineStatistics.getAverageRunTime();
		data[1][10]=nineByTenStatistics.getAverageRunTime();
		data[1][11]=tenByTenStatistics.getAverageRunTime();
		*/
		//collecting of number of spaces on each chessboard
		
		data[2][0]=fiveByFiveStatistics.getSpaces();/*
		data[2][1]=fiveBySixStatistics.getSpaces();
		data[2][2]=sixBySixStatistics.getSpaces();
		data[2][3]=sixBySevenStatistics.getSpaces();
		data[2][4]=sixByEightStatistics.getSpaces();
		data[2][5]=sevenBySevenStatistics.getSpaces();
		data[2][6]=sevenByEightStatistics.getSpaces();
		data[2][7]=eightByEightStatistics.getSpaces();
		data[2][8]=eightByNineStatistics.getSpaces();
		data[2][9]=nineByNineStatistics.getSpaces();
		data[2][10]=nineByTenStatistics.getSpaces();
		data[2][11]=tenByTenStatistics.getSpaces();
		
		*/
		// printing of final data matrix
		
        	for (int x = 0; x < 3; x++) 
				{ 
            		for (int y = 0; y < 1; y++)
						{
                			System.out.print(data[x][y] + " "); 
						}
            		System.out.println(); 
				}
			System.out.println();	
			
			
			
			System.out.println("average memory used per run: " + fiveByFiveStatistics.getAverageMemUsed() + " bytes");
		
			System.out.println("average time per run: " + fiveByFiveStatistics.getAverageRunTime() + " nanoseconds");
		
			System.out.println("number of spaces on this board: " + fiveByFiveStatistics.getSpaces());
		
			System.out.println("number of valid runs on this board: " + fiveByFiveStatistics.getTotalRuns());
		
			System.out.println("does this board have a valid knight's tour? : " + fiveByFiveStatistics.isBoardValid());
			
			
		}
	}
			