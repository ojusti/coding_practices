package practice;

public class BowlingGame
{
    int[] rolls;
    public int score()
    {
        int score = 0;
        int rollNumber = 0;
        int TOTAL_FRAMES = 10;
        int PINS = 10;
		for (int frameNumber = 0; frameNumber < TOTAL_FRAMES; frameNumber++)
        {
			if(isStrike(rollNumber))
			{
				score += PINS + nextTwoBallsAfterStrike(rollNumber);
                rollNumber += 1;
			}
			else if(isSpare(rollNumber))
			{
				score += twoBallsInFrame(rollNumber);
                rollNumber += 2;
			}
			else
			{
				score += PINS + nextBallAfterSpare(rollNumber);
                rollNumber += 2;
			}
        }
        return score;
    }

    private boolean isStrike(int rollNumber)
    {
        return rolls[rollNumber] == 10;
    }
    
    private boolean isSpare(int rollNumber)
    {
        return twoBallsInFrame(rollNumber) == 10;
    }
    
    private int nextBallAfterSpare(int rollNumber)
    {
        return rolls[rollNumber + 2];
    }

    private int nextTwoBallsAfterStrike(int rollNumber)
    {
        return rolls[rollNumber + 1] + rolls[rollNumber + 2];
    }

    private int twoBallsInFrame(int rollNumber)
    {
        return rolls[rollNumber] + rolls[rollNumber + 1];
    }
}
