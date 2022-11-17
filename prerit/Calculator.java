class Calculator {
	
	void add(int a, int b)	{
		System.out.println(a + b);
	}
	
	void sub(int a, int b) {
		System.out.println(a - b);
	}
	
	void mul(int a, int b)	{
		System.out.println(a * b);
	} 

	void div(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();

		obj.add(10, 20);

		obj.sub(10, 20);

		obj.mul(10, 20);
		
		obj.div(10, 20);
	}
}
