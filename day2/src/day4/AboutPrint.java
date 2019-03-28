package day4;

public class AboutPrint {
	public static void main(String[] args) {
		//System.out.println("这个是println");
		//System.out.printf("这个是printf");
		//System.out.print("这个是print");
		
		/*
		 * printf主要是继承了C语言的printf的一些特性，可以进行格式化输出
		 * 
		 * print就是一般的标准输出，但是不换行
		 * 
		 * println和print基本没什么差别，就是最后会换行
		 */

		
		//println("joker")  相当于 print("joker\n")
		System.out.print("joker\n");//   \n  是一种转义字符，代表换行
		System.out.println("joker");
		
		
		//printf 是C语言独有的东西，但是java保留了
		
		System.out.printf("joker is %s","流氓");
		//上面的语句相当于
		System.out.print("joker is "+"流氓");
		
		//平时是不用printf的，我们以后都是使用println进行代码输出
		
	}
}
