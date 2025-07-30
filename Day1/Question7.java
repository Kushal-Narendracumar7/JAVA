public class Question7{
	public static void main(String args[]){
		int num = 57;
		boolean flag = true;
		if(num == 0){
			System.out.println("Number is zero");
		}else if(num % 2 != 0){
			flag = false;
		}else{}
		
		if(flag){
			System.out.println(num+" is even..");
		}else{
			System.out.println(num + " is odd..");	
		}
	}
}