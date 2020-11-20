package $orcbank$;

public class Creditplan {

	public void seeourplans() {
		 System.out.println("Our current Credit Plans");
	        System.out.println();
	        System.out.println("Student Orc Plan");
	        System.out.println();
	        System.out.println();
	        System.out.printf("%s            %s      %s", "Institution ", "years", "interest\n");
	        System.out.println();
	        System.out.printf("%s      %s   %s", "Hamilton Inacap","...=2"     ,       "1.5%\n");
	        System.out.printf("%s       %s          %s"," .......... .....","=3", "1.0%\n");
	        System.out.printf("%s       %s          %s"," .......... .....",">=4", "0.4%\n");
	        System.out.println();
	        System.out.printf("%s      %s   %s", "Howard Orc school ","...=2"     ,       "0.9%\n");
	        System.out.printf("%s       %s          %s"," .......... .....",">=3", "0.5%\n");
	        System.out.println("\n");
	        System.out.println("Business Orc credit plan");
	        System.out.printf("%s                     %s", "amount", "interest\n");
	        System.out.printf("%s                     %s", "1000 $", "1%\n");
	        System.out.printf("%s                     %s", "2000 $", "0.8%\n");
	        System.out.printf("%s      %s", "from 3000 $ to 5000 $", "0.5%");
	        System.out.println();
		
	}

}
