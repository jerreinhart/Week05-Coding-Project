package week05Project;

public class Week05 {

	public static void main(String[] args) {
	Logger asterisk = new AsteriskLogger();
	
	asterisk.log("Jordan");
	asterisk.error("Reinhart");
	
	
	Logger spaced = new SpacedLogger();
	spaced.log("coding is fun");
	spaced.error("coding is challenging");
	}

}
