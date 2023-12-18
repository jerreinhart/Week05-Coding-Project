package week05Project;

public class SpacedLogger implements Logger {

	public SpacedLogger() {
	}
		public void log(String str) {
		StringBuilder spacedString = new StringBuilder();
			for (int i = 0; i < str.length(); i++) {
				spacedString = spacedString.append(str.charAt(i));
				if (i == str.length() - 1)
					break;
				spacedString = spacedString.append(' ');
			}
			System.out.println();
			System.out.println(spacedString.toString());
		}
		public void error(String str) {
			StringBuilder spacedString = new StringBuilder();
			for (int i = 0; i < str.length(); i++) {
				spacedString = spacedString.append(str.charAt(i));
				if (i == str.length() - 1)
					break;
				spacedString = spacedString.append(' ');
			}
			System.out.println();
			System.out.println("ERROR: " + spacedString.toString());
		}
	}


