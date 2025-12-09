//package com.sunbeam;
interface A{
	/*public static final*/int num1 = 10; 
	/*public static final*/int num2 = 20; 
}
interface B{
	/*public static final*/int num3 = 30; 
	/*public static final*/int num4 = 40; 
}
interface C extends A , B{
	/*public static final*/int num5 = 50; 
}
public class Program {
	
	public static void main(String[] args) {
		System.out.println("num1 : "+C.num1);
		System.out.println("num2 : "+C.num2);
		System.out.println("num3 : "+C.num3);
		System.out.println("num4 : "+C.num4);
		System.out.println("num : "+C.num5);
	}
	public static void main2(String[] args) {
		System.out.println("num3 : "+B.num3);
		System.out.println("num4 : "+B.num4);
	}
	public static void main1(String[] args) {
		System.out.println("num1 : "+A.num1);
		System.out.println("num1 : "+A.num2);

	}

}
//