class Calculator {
	
	// These are void methods, they don't return anything
	
	// void add(int a, int b)	{
	// 	System.out.println(a + b);
	// }
	
	// void sub(int a, int b) {
	// 	System.out.println(a - b);
	// }
	
	// void mul(int a, int b)	{
	// 	System.out.println(a * b);
	// } 

	// void div(int a, int b) {
	// 	System.out.println(a / b);
	// }

	int add(int a, int b)	{
		return (a + b);
	}
	
	int sub(int a, int b) {
		return (a - b);
	}
	
	int mul(int a, int b)	{
		return (a * b);
	} 

	int div(int a, int b) {
		return (a / b);
	}
	
	// overriding the toString() will allow us to customise the output when we'll print the object
	public String toString() {
		return "this is an instance of Calculator class";
	}
	public static void main(String[] args) {
		Calculator obj = new Calculator();

		int output = obj.add(10, 20);
		System.out.println(output);
		
		output = obj.sub(10, 20);
		System.out.println(output);
		
		output = obj.mul(10, 20);
		System.out.println(output);
		
		output = obj.div(10, 20);
		System.out.println(output);
	}
}
