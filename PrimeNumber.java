package week1.day1;

public class PrimeNumber {

	
	
		
	
	public static void main(String[] args) {

		int input=13;
		boolean flag =false;
		for(int i=2;i<=input/2;i++) {
			if(i%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
	
		
		System.out.println(input + "is not Prime number.");}
		else {
		System.out.println(input + "is  a Prime number.");
	}
	}
}
