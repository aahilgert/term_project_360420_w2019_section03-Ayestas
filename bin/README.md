# Knights Tour Analysis Code

## Analysis.java

This code creates eleven boards and conducts numerous knight's tours on each board, both using BoardClass.  It transfers RunData objects produced by each run to its associated BoardStatistics object.  Then outputs relevant data to the terminal.  This data consists of average memory usage, average run times, and board space counts. 

## BoardClass.java

This object is essentially a chessboard with the functionality of solving any knight's tour starting at a valid initial board space.  It also has the ability to print a tour's solution matrix, and measure the time taken and memory allocated per run. For each run, a RunData object is returns, holding all important data for its specific run.  

## RunData.java

This object houses all relevant information to a run (or iteration).  It has the ability to return all of these data points, but it is primarily used to transfer run information to its associated BoardStatistics object. It also conducts primitive calculations regarding run time and run memory.  

## BoardStatistics.java

This object collects the data from RunData objects that are from knight's tours performed on a board of its size.  It sums the memory and time values of runs that were not DNE, and finds average run values.  It can return these values as well as chessboard attributes.  

## SameersTestAnalysis.java

Analysis.java has far too long of a run time for your to run on your computer. The first three boards have a run time of about 30 minutes to an hour, while the full program will take days to complete. Because of this, for your convenience, I have created an equivalent class that only operates on the first board (5 by 5). Analysis.java functions in exactly the same way, but over eleven board sizes.  This class will also print values with string attached to them for you to better understand their meanings.  The run time will be approximately five minutes.

## SameersTestCase.java

In addition or in lieu of the previous code, you could run this class to assure that my code correctly solves the knights tour.  This class will run the program on an initial point of 0i + 0j on a 5 by 5 board.  This will print its solution matrix onto the terminal.  Matrix numbers on the terminal correspond to move numbers.  0 is the initial point. A correct return is incredibly improbable for a knights tour, without an absolutely functional solving mechanism.

There is more information as to each method's function commented in each file.



