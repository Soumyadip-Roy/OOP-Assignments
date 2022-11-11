import java.util.Scanner;

class AsstProjectManager extends Employee{
	public double getBasic() {
		System.out.print("Enter Programmer's basic pay : ");
		double basicPay = sc.nextDouble();
		return basicPay;
	}
}

class Programmer extends Employee{
	public double getBasic() {
		System.out.print("Enter Programmer's basic pay : ");
		double basicPay = sc.nextDouble();
		return basicPay;
	}
}

class ProjectManager extends Employee{
	public double getBasic() {
		System.out.print("Enter Project Manager's basic pay : ");
		double basicPay = sc.nextDouble();
		return basicPay;
	}
}

class TeamLead extends Employee{
	public double getBasic() {
		System.out.print("Enter Team Leads's basic pay : ");
		double basicPay = sc.nextDouble();
		return basicPay;
	}
}

public class Employee {
	
	public Scanner sc = new Scanner(System.in);
	
	public String name , mail_id , address ,mob_no;
	public int empid;

	public void getData() {
		System.out.print("Enter id : ");
		empid=sc.nextInt();
		
		System.out.print("Enter name : ");
		String enter = sc.nextLine();
		name=sc.nextLine();
		
		getMob();
		
		getMail();
		
		System.out.print("Enter address : ");
//		enter = sc.nextLine();
		address=sc.nextLine();
//		
	}
	
	public void getMail() {
		System.out.print("Enter Email Id : ");
		mail_id=sc.nextLine();
		if(mail_id.contains("@")==false || mail_id.contains(".")==false) {
			System.out.println("Enter correct email");
			getMail();
		}

	}
	public void getMob() {
		System.out.print("Enter Mobile No. : ");
//		String enter = sc.nextLine();
		mob_no=sc.nextLine();
		if(mob_no.length()!=10){
			System.out.println("Enter correct Mobile Number ");
			getMob();
		}
	}
	
	public void display() {
		System.out.println("*********************************\n\tEmployee Details\n*********************************");
		System.out.println("Id : "+empid);
		System.out.println("Name : "+name);
		System.out.println("Mobile No. : "+mob_no);
		System.out.println("Email Id : "+mail_id);
		System.out.println("Address : "+address);
	}
	public double da , hra , pf , clubFee, netSalary , grossSalary;
	
	public void setSalary(double basicPay) {
		da = 0.97*basicPay;
		hra = 0.1*basicPay;
		pf = 0.12*basicPay;
		clubFee = 0.001*basicPay;
		
		grossSalary = basicPay+da+hra+pf+clubFee;
		netSalary = grossSalary - clubFee;
		
	}
	
	public void paySlip() {
		display();
		System.out.println("*********************************\n\tPAYSLIP\n********************************");
		System.out.println("DA : "+da);
		System.out.println("HRA : "+hra);
		System.out.println("PF : "+pf);
		System.out.println("Club Fee : "+clubFee);
		System.out.println("NetSalary : "+netSalary);
		System.out.println("GrossSalary : "+grossSalary);
	}

	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int cont;
		do {
			System.out.println("1 - Programmer \n2 - Teamlead \n3 - Assistant Manager \n4 - Assistant Project Manager \n0 - EXIT");
			System.out.print("Enter whose pay slip is to be genetated : ");
			int x = sc.nextInt();
			
			switch(x){
				case 1:
					Programmer p1 = new Programmer();
					p1.getData();
					p1.setSalary(p1.getBasic());
					p1.paySlip();
					break;
				case 2:
					TeamLead tl = new TeamLead();
					tl.getData();
					tl.setSalary(tl.getBasic());
					tl.paySlip();
					break;
				case 3:
					ProjectManager pm = new ProjectManager();
					pm.getData();
					pm.setSalary(pm.getBasic());
					pm.paySlip();
					break;
				case 4:
					AsstProjectManager apm = new AsstProjectManager();
					apm.getData();
					apm.setSalary(apm.getBasic());
					apm.paySlip();
					break;
				case 0:
					break;
				default:
					System.out.println("Please Enter correct choice !");
					break;
			}
			System.out.print("Press 1 to continue :");
			cont = sc.nextInt();
		}while(cont==1);
		sc.close();
	}	
}
