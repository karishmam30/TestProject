
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 371;
		int copyOfNumber = number;
		int sum=0;
		int noofDigits= String.valueOf(number).length();
		
		while(copyOfNumber!=0) {
		int lastdigit = copyOfNumber%10;
		int lastdigittothepowerofnoofdigits =1;
		
		for(int i=0; i<noofDigits; i++) {
			
			lastdigittothepowerofnoofdigits = lastdigittothepowerofnoofdigits * lastdigit;
		}
		sum = sum + lastdigittothepowerofnoofdigits;
		copyOfNumber = copyOfNumber/10;
	}
		if(sum ==number) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not an Armstrong number");
		}
	}

}
