
public class Mobile {
	
	public int makeACall(int num)
	{
		//System.out.println(num);
		return num;
	}
	
	public String sendSMS()
	{
		System.out.println("sendSMSMEthod");
		return "sendSMS";
	}
	
	public void shutDown() 
	{
		System.out.println("shutDown");
	}
	
	public static void main(String[] args)
		{		
		Mobile calls = new Mobile();
		int number = calls.makeACall(3453453);
		System.out.println(number);
		//System.out.println(calls.makeACall());
		calls.sendSMS();
		calls.shutDown();
	}

}
