package seleniumsessions;

public class GoogleTest {

	public static void main(String[] args) {
		BrowserActions br=new BrowserActions();
		br.launchBrowser("chrome");
		br.launchUrl("http://www.google.com");
		String title=br.doGetTitle();
		System.out.println("page title is "+ title);
		if (title.equals("Google")) {
			System.out.println("correct title");
			
		}
		else {
			System.out.println("incorrect title");
		}

	}

}
