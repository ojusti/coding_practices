package practice;

public class Except implements Runnable
{
	@Override
	public void run() 
	{
		try 
		{
			subtask();
			subtask();
		} 
		catch (Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	private void subtask() throws Exception
	{
		if(Math.random() < 0.5)
		{
			throw new Exception("beau message");
		}
	}
}
