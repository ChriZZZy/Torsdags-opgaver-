public class Fibonacci{

	static int max = 1000;
	static int number1 = 0;
	static int number2 = 1; 
	static int number3 = 0;


	static public void Fibonaccicount (){

		if(number1 + number2 < max){
			number3 = number1 + number2;
			number1 = number2;
			number2 = number3; 
			System.out.print(number3 + " ");
				Fibonaccicount();	
		}

	}



	public static void main(String[] args) {
		Fibonaccicount	();	

	}	
}