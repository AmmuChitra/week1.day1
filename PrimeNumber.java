package week1.day1;

public class PrimeNumber {

	
	
		
	
	public static void main(String[] args) {

		int input=8;//2,4,1,8
		boolean flag =false;
		for(int i=2;i<=input;i++) {
			if(input%i ==0) { 
				flag=true;
			
				System.out.println(i);
				break;
			}
			System.out.println(i);
		}
		if(!flag) {
	
		
		System.out.println(input + "is not Prime number.");
		}
		else {
		System.out.println(input + "is  a Prime number.");
		}
	}
	}

