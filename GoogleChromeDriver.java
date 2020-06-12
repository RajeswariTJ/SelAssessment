package week1.day2;

public class GoogleChromeDriver {
	
	public void getUrl() {
		System.out.println("The URL got loaded");
	}
	public String getText(String text) {
		System.out.println("getting Text");
		return text;
	}
	public void click() {
		System.out.println("Click the URL");
	}
	public boolean isSelected()
	{
		System.out.println("Select the URL");
		return true;
	}

public static void main(String[] args) {
	GoogleChromeDriver gcd = new GoogleChromeDriver();
	gcd.getUrl();
	String text = gcd.getText("Learn Selenium");
	System.out.println("Text: "+text);
	gcd.click();
	boolean selected = gcd.isSelected();
	System.out.println("isSelected: "+selected);
}}