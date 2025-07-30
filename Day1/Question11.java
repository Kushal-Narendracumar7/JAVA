public class Question11{
	public static void main(String[] args){
		int num = 123;
		int actualNum = num;
		int sum = 0;
		
		while(num != 0){
			int digit = num % 10;
			sum += digit;
			num /= 10;
		}
		
		System.out.printf("The sum of %d is %d",actualNum,sum);
	}
}