//is executing in Main Thread
public class Driver {

	public static void main(String[] args)
	{
		WorkerBee wb1 = new WorkerBee("WB1");
		WorkerBee wb2 = new WorkerBee("WB2");
		WorkerBee wb3 = new WorkerBee("WB3");
		
		/**
		wb1.run(); //this DOES block the next line 
		wb2.run();
		wb3.run();
		**/
		
		wb1.start(); //this does NOT block the next line
		wb2.start();
		wb3.start();
		
		//Thread class itself can report how many active threads are going while your program is running
		System.out.println("*******************" + Thread.activeCount() + "******************");
		while(Thread.activeCount() > 1) 
		{
			//do nothing 
			//busy wait loop 
			//Hack
		}
		//^^ this allows the code below to not run until all 3 threads above are done
	
		for(int i = 0; i < 100; i++)
		{
			System.out.println("WOOT");
		}
	}

}
