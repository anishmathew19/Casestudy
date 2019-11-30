package anish;

public class Casestudy61 {
	int id;
	String name;
	String address;
	String ph;
	String email;
	String ptype;
	String pid;
	public void register(int id,String name,String address,String ph,String email,String ptype,String pid)
	{
	this.id=id;
	this.name=name;
	this.address=address;
	this.ph=ph;
	this.email=email;
	this.ptype=ptype;
	this.pid=pid;
	
	}
	public void ViewCustomers()
	{
		System.out.println(name+"\t\t"+id);
	}
	

}
