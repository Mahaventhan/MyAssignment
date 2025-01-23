package week3.assignment_W3;

public class Elements extends Button {

	public static void main(String[] args) {
		
		//Webelement Object  --Base class
		WebElement web = new WebElement();
		web.click();
		web.setText("Gmail");
		 
		//Button object  --Sub class
		
		Button bu = new Button();
		bu.submit();
		bu.setText("Login Button");
		
		//textfield object --Sub class
		
		TextField txt = new TextField();
		txt.click();
		txt.getText("Welcome to application");
		
		//checkbox --Sub class inherit form the Button
		
		CheckBoxButton ch = new CheckBoxButton();
		ch.setText("CheckBox Enabled");
		ch.clickCheckButton();
		
		//radiobutton  -Sub class inherit form the Button
		
		RadioButton ra = new RadioButton();
		ra.selectRadioButton();
		ra.submit();
		ra.click();
		
		//create elements  -Sub class inherit form the Button
		
		Elements e = new Elements();
		e.submit();
		e.click();
		e.setText("Element intract");
		
		
	}
	
}
