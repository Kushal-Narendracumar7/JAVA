public class Question10{
	public static void main(String[] args){
		int num = 549;
		int actualNum = num;
		int reverseNum=0;
		while(num!=0){
			int digit = num % 10;
			reverseNum = reverseNum*10 +  digit;
			num /=10;
		}
		
		System.out.printf("The reverse of %d id %d..",actualNum,reverseNum);
	}
}