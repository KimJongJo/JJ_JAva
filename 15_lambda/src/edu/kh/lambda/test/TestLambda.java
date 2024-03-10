package edu.kh.lambda.test;

interface PrintString {
	void showString(String str);
}


public class TestLambda {
	public static void main(String[] args) {
		// 람다식을 인터페이스형 변수에 대입하고 그 변수를 사용해 람다식 구현부 호출
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello lamda_1");
		
		
		// 메서드의 매개변수로 람다식을 대입한 변수 전달
		showMyString(lambdaStr);
		
		
		PrintString reStr = returnString();	// 변수로 반환받기
		reStr.showString("hello ");			// 메서드 호출
	}
	
	public static void showMyString(PrintString p) /* 매개변수를 인터페이스형으로 받음 */ {
		p.showString("hello lamda_2");
	}
	
	public static PrintString returnString() {	// 람다식을 반환하는 메서드
		return s -> System.out.println(s + "world");
	}
	
	
	
	/* 메서드 람다식으로 변환 */
	/* 1.
	int max(int a, int b) {
		return a > b ? a : b;
	}
	
	(a, b) -> a > b ? a : b
	
	*/
	
	
	/* 2.
	void printVar(String name, int i) {
		System.out.println(name + "=" + i);

	}
	
	(name, i) -> System.out.println(name + "=" + i)
	
	*/
	
	
	
	/* 3.
	int square(int x) {
		return x * x;
	}
	
	x -> x * x
	
	
	*/
	
	
	/* 4.
	int roll() {
		return (int)(Math.random() * 6);
	}
	
	() -> (int)(Math.random() * 6)
	
	
	*/
	
	
	/* 5.
	int sumArr(int[] arr) {
		int sum = 0;
		for(int i : arr)
			sum += i;
		return sum;
	}
	
	(int[] arr) -> {
		int sum = 0;
		for(int i : arr)
			sum += i;
		return sum;
	}
	
	*/
	
	
	
	
	
	
	
	
	
}
