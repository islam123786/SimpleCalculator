package Calulator;


public class Calculator {
	
	
	static int Add(int val1, int val2)
	{
		return val1 + val2;
	}
	
	static int Substration(int val1, int val2)
	{
		return val1 - val2;
	}
	
	static int Multiply(int val1, int val2)
	{
		return val1*val2;
	}

	public static void main(String[] args) {
		
		int val1 = 10;
		int val2 = 20;
		
		int AddResult = Add(val1, val2);
		int SubResult = Substration(val2, val1);
		int MulResult = Multiply(val1, val2);
			

	}
	

}
