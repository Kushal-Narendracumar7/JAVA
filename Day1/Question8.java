public class Question8{
	public static void main(String[] args){
		int a = 19;
		int b = 45;
		
		System.out.println("Before swap \n a = "+a+" & b = "+b);
		
		int temp = a;
		a = b; 
		b = temp;
		System.out.println("After swap \n a = "+a+" & b = "+b);
		
	}
}