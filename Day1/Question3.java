public class Question3{
	public static void main(String[] args){
		int num1 = 10;
		int num2 = 45;
		int num3 = 5;
		
		if(num1 > num2){
			if(num1>num3){
				System.out.println(num1+" is greatest..");
			}else{
				System.out.println(num3 + " is greatest..");
			}
		}else{
			System.out.println(num2 + " is greatest..");
		}
	}
}