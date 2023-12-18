package week05Project;

public class AsteriskLogger implements Logger {

	public AsteriskLogger() {
	}
	public void log(String str) {
			System.out.println("***" + str + "***");
		}
	public void error(String str) {
			String asterisk = "*";
			String asteriskRepeated = asterisk.repeat(13 + str.length());
			System.out.println();
			System.out.println(asteriskRepeated);
			System.out.println("***" + "ERROR: " + str + "***");
			System.out.println(asteriskRepeated);
		}
	}


