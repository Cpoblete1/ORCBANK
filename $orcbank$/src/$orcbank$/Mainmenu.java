package $orcbank$;

import java.util.Scanner;

public class Mainmenu {
		private Scanner scanner = new Scanner(System.in);
		private person[]people;
		public void mainGeneral() {
		createPeople();
		int option;
		do { System.out.println(" WELCOME TO THE MIGHTEST BANK OF MIDDLE EARTH \n Please choose an option\n1.see our plans\n2.calculate your credit\n3.client history\n4.Financial report      \n5.exit");
		option=scanner.nextInt();
		switch(option) {
		case 1 : Creditplan creditplans= new Creditplan();
				creditplans.seeourplans();
		break;
		case 3: Clienthistory(people);
		break;
		case 4: financialreport(people);
		break;
		case 2: NewClient (people);
		break;
		case 5: System.out.println("See you soon Mighty warrior !>:D");
		break;
	
		
		}
		
		
		} while (option !=5);
		
		
	}

	private void NewClient(person[] people2) {
		Scanner input= new Scanner (System.in);
		System.out.println("enter anual interest rate");
		double annualinterestrate= input.nextDouble();
		double monthlyinterestrate= annualinterestrate /1200;
		System.out.println("enter how many years you would like to have ej.1,2,3");
		int numberofyears= input.nextInt();
		System.out.println("enter amount of money");
		input.nextDouble();
		double monthlypayment= monthlyinterestrate/(1-1/Math.pow(1+ monthlyinterestrate, numberofyears*12));
		double totalpayment= monthlypayment* numberofyears*12;
		System.out.println("Monthly payment is $"+(int)(monthlypayment*100/100.0));
		System.out.println("Total payment is $"+(int)(totalpayment*100/100.0));
		
	}

	private void financialreport(person[] people2) {
		// TODO Auto-generated method stub
		
	}

	private void Clienthistory(person[] people2) {
		// TODO Auto-generated method stub
		
	}

	private void createPeople() {
		// TODO Auto-generated method stub
		
	}

}
