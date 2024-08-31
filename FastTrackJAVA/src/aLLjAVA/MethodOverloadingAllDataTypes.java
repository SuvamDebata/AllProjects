package aLLjAVA;

public class MethodOverloadingAllDataTypes {

	public static void main(String[] args) {
		MethodOverloadingAllDataTypes.m1(140);
		MethodOverloadingAllDataTypes.m1(4.0);
		MethodOverloadingAllDataTypes.m1(-127);
		MethodOverloadingAllDataTypes.m1(128);
		MethodOverloadingAllDataTypes.m1("h");
		MethodOverloadingAllDataTypes.m1('h');
		MethodOverloadingAllDataTypes.m1(123456789);
		MethodOverloadingAllDataTypes.m1(123456789l);
	}
	public static void m1(byte a) {
		System.out.println(1);
	}
	public static void m1(short a) {
		System.out.println(2);
	}
	public static void m1(int a) {
		System.out.println(3);
	}
	public static void m1(long a) {
		System.out.println(4);
	}
	public static void m1(float a) {
		System.out.println(5);
	}
	public static void m1(double a) {
		System.out.println(6);
	}
	public static void m1(char a) {
		System.out.println(7);
	}
	public static void m1(String a) {
		System.out.println(8);
	}

}
