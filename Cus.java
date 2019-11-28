package anish;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Cus {

	
	

	void check() throws NumberFormatException, IOException
	{
		System.out.println("enter the room number");
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	int che=Integer.parseInt(in.readLine());
	if(Book.arr[che-1]==0)
	{
		System.out.println("room is not booked");
	}
	if(Book.arr[che-1]==1)
	{
		System.out.println("room is booked");
	}
		
	
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int  op;
		String ac="null";
		String cot="null";
		String cable="null";
		String wifi="null";
		String laundry="null";
		do {
		System.out.println("MENU");
		System.out.println("1.booking");
		System.out.println("2.check staus");
		System.out.println("3.Exit");
		Cus obj=new Cus();
		 Book obj1=new Book();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		op=Integer.parseInt(in.readLine());
		switch(op)
		{
		case 1:
			obj1.book(ac,cot,cable,wifi,laundry);
			break;
		case 2:
			
			obj.check();
			break;
		case 3:
			System.exit(0);
			break;
		default:
				break;
			
			
		}
		}while(true);
			
	}

}
