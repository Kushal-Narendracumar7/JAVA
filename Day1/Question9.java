public class Question9{
	public static void main(String[] args){
		int fact = 1;
		int num = 5;
		for(int i=1;i<=num;i++){
			fact*=i;
		}
		System.out.printf("The factorial of %d is %d..",num,fact);
	
	}
}