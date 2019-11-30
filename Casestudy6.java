package anish;

import java.util.Scanner;

public class Casestudy6 {

	public static void main(String[] args) {
		
		Casestudy61 arr[]=new Casestudy61 [10];		
		int id=1;
		int i=0;
		int r;
		String op1;
		String op2;
		Scanner obj=new Scanner(System.in);
		do
		{
		System.out.print("1.Reg \n2.View \n3.Exit---->");
		r=obj.nextInt();
		switch(r)
		{
		case 1:
			do
			{
			System.out.println("<\t----****Redistration***----->");
			System.out.println("Enter your name:");
			String n=obj.next();
			System.out.println("Enter your address:");
			String a=obj.next();
			System.out.println("Contact Number:");
			String p=obj.next();
			System.out.println("Email ID:\n");
			String e=obj.next();
			System.out.println("Enter proof type:");
			String pt=obj.next();
			System.out.println("Enter proof id:");
			String pi=obj.next();
			arr[i]=new Casestudy61();
			arr[i].register(id,n,a,p,e,pt,pi);
			System.out.println("Thank you for registering.Your id is :"+id);
			System.out.println("Do you want to continue registration (y/n)?");
			op1=obj.next();
			id++;
			i++;
			}while(op1.equals("y")||op1.equals("Y"));
			break;
		case 2:
			System.out.println("Customers list\nThe registered customers are");
			System.out.println("Customer ID   Customer Name ");
			for(int j=0;j<i;j++)
			{
			arr[j].ViewCustomers();	
		    }
			System.out.println("Thank you");
			break;
		case 3:
			System.exit(0);
			break;
			default:
		break;
		}
		System.out.println("Do you want to continue (yes/no)");
		op2=obj.next();
	}while(op2.equals("yes")||op2.equals("YES"));
		System.out.println("\t***Thank you***");
		System.exit(0);
		

}
}
 