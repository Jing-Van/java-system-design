package abstractfactory;

public interface Bank {
	String getBankName();
}

//Step 2 

//Create concrete classes that will implement the  Bank interface. 

class HDFC implements Bank
{

	private final String BNAME;
	
	public HDFC()
	{
	   BNAME="HDFC BANK";
	}

	//  @override
	public String getBankName()
	{
	     return BNAME;
	
	}

}


class ICICI implements Bank
{

	private final String BNAME;
	
	public ICICI()
	{
	   BNAME="ICICI BANK";
	}
	
	//  @override
	public String getBankName()
	{
	     return BNAME;
	
	}

}


class SBI implements Bank
{

	private final String BNAME;
	
	public SBI()
	{
	   BNAME="SBI BANK";
	}
	
	//  @override
	public String getBankName()
	{
	     return BNAME;
	
	}

}


