public class SameersTestCase
{
	public static void main(String[] args)
			
		{
			// if you would like to simply run one knights tour, run this code
			// this will return a solution matrix for a knights tour with the initial point of 0i + 0j on a 5 by 5 chessboard
			
			BoardClass sampleRun = new BoardClass(5,5);
			
			int[][] solnMatrix = sampleRun.programIteration(0,0);
				
			BoardClass.printFunction(solnMatrix);
		}
}