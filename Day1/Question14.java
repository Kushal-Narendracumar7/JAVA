
public class Question14{
	public static void main(String[] args){
		// q1(5);
		// System.out.println();
		// q2(5);
		// System.out.println();
		// q3(5);
		// System.out.println();
		// q4(5);
		// System.out.println();
		// q5(5);
		// System.out.println();
		// q6(5);
		// System.out.println();
		// q7(5);
		// System.out.println();
		// q8(5);
		// System.out.println();
		// q9(5);
		// System.out.println();
		// q10(5);
		// System.out.println();
		// q11(5);
		// System.out.println();
		q12(5);
	}
	
	public static void q1(int rows){
		for(int i=0;i<rows;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void q2(int rows){
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void q3(int rows){
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	} 
	
	public static void q4(int rows){
		char ch = 'A';
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
	} 
	
	public static void q5(int rows){
		
		for(int i=1;i<=rows;i++){
			char ch = 'A';
			for(int j=1;j<=i;j++){	
				System.out.print(ch+" ");
				ch++;
			}
			
			System.out.println();
		}
	}

	
	public static void q6(int rows){
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				if(c ==0){
					System.out.print(1+" ");
					c=a+b;
				}else{
					
					System.out.print(c+" ");
					c = a+b;
				}
				a=b;
				b=c;
			}
			System.out.println();
		}
	}

	public static void q7(int rows){
		for(int i=0;i<rows;i++){
				int a=0;
				int b=1;
			for(int j=0;j<=i;j++){
				System.out.print(a + " ");
				int temp = a;
				a=b;
				b=temp+b;
			}
			System.out.println();
		}
	}
	public static void q8(int rows){
		int num = 1;
		for(int i=0;i<rows;i++){
			for(int j=0;j<=i;j++){
				System.out.print(num + " ");
				num++;
				num = num == 10 ? 1 : num;
			}
			System.out.println();
		}
	}

	public static void q9(int rows){
		
		for(int i=0;i<rows;i++){
			int num = i+1;
			int space = rows-1;
			for(int j=0;j<=i;j++){
				System.out.print(num + " ");
				num = num + space;
				space--;
			}
			
			System.out.println();
		}
	}

	public static void q10(int rows){
		int num = 0;
		for(int i=0;i<rows;i++){
			if(i % 2 == 0){
				num = 1;
			}else{
				num = 2;
			}
			for(int j=0;j<=i;j++){
				System.out.print(num + " ");
				num += 2;
			}
			System.out.println();
		}
	}

	public static void q11(int rows){
		int num = 1;
		int temp = 4;
		

		for(int i=0;i<rows;i++){
			for(int j=0;j<=i;j++){
				System.out.print(num-- + " ");
			}
			num = num == 0 ? 1 : num;
			if(i == 0){
				num = num + (i+2);
			}else{
				num = num + temp + 1;
				temp = temp + 2;
			}
			System.out.println();
		}
	}

	public static void q12(int rows){
		int num = 1;

		for(int i=1;i<=rows;i++){

			// for spaces 
			for(int j=1;j<=rows-i;j++){
				System.out.print("\t");
			}


			int totalNum = 2*i -1;
			int temp = num;
			int sum = 0;

			//getting the total of all the elements int the row 
			for(int j=1;j<totalNum;j++){
				sum += temp;
				temp += 2;
			}

			

			//for printing the numbers 
			for(int j=1;j<=totalNum;j++){
				if(j != i){
					System.out.print(num + "\t");
					num += 2;
				}else if(j == i && i == 1){
					System.out.print(num + "\t");
					num += 2;
				}
				else{
					System.out.print(sum + "\t");
					
				}
				
			}
			System.out.println();
		}
	}

}
