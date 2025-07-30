public class Question5{
	public static void main(String[] args){
		int num = 7;
		boolean flag = true;
		if(num == 2){
			flag = true;
		}else{
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num % i == 0){
				flag = false;
			}
		}
		}
		if(flag){
			System.out.println(num + " is a prime number..");
		}else{
			System.out.println(num+" is not a prime number..");
		}
	}
}