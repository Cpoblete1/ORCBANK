package $orcbank$;

public class person {
	private final String name;
	private final String Lastname;
	private final String Orcnumber;
	
public person( String name, String Lastname, String Orcnumber) {
	this.name= name;
	this.Lastname=Lastname;
	this.Orcnumber=Orcnumber;
}
	public String getName() {
		return name;
	}
	public String getlastname() {
		return Lastname;
	}
	
}
