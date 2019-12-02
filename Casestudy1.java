package anish;
import java.util.Scanner;

public class Casestudy1 {
	
	 String Name;
	 String address;
	int contactnumber;
	String email;
	String prooftype;
	String proofid;
	int k=1;
public Casestudy1( String name,String address,int contactnumber,String prooftype,String proofid)
{
	this.Name=name;
	this.address=address;
	this.contactnumber=contactnumber;
	this.prooftype=prooftype;
	this.proofid=proofid;
}
void  display()
{
	System.out.println("Thank you for registering. Your id is "+k);
	k++;
	System.out.println("name:"+this.Name);
	System.out.println("address:"+this.address);
	System.out.println("contactnumber:"+this.contactnumber);
	System.out.println("prooftype:"+this.prooftype);
	System.out.println("proofid:"+this.proofid);
}



	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name ");
		 String name=s.next();

		System.out.println("Enter your address");
		 String address=s.next();
		 System.out.println("Enter your number");
		int contactnumber=s.nextInt();
		
		
		System.out.println("Enter your proooftype");
		String prooftype=s.next();
		System.out.println("Enter your proofid");
		String proofid=s.next();
		Casestudy1 obj=new Casestudy1(name,address,contactnumber,prooftype,proofid);
		obj.display();
		
		
	
		
		
		
	}

}
