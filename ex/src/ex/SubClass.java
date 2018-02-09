package ex;

public class SubClass implements Hab {
	@Override
	public void calc(NumVo nc){
		
		System.out.println("빼기프로그램");
		int num1= nc.getNum1();
		int num2= nc.getNum2();
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}
}
