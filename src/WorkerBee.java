
public class WorkerBee extends Thread
{
	private String name;
	
	public WorkerBee(String name)
	{
		this.name = name;
	}
	
	public void run()
	{
		for(int i = 0; i < 1000; i++)
		{
			System.out.println(this.name + " : " + i);
		}
	}
}
