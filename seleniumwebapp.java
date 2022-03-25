package week1.day1;

public class seleniumwebapp {

	 public static void main(String[] args) { 
		 WebDriverManager.chromedriver().setup();  
		 ChromeDriver driver=new ChromeDriver();  
		 driver.get("http://leaftaps.com/opentaps/control/main"); 
		 } 

}
