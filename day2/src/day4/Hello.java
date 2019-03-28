package day4;
//Java 是面向对象编程
//编程有两种思想：1.面向过程2.面向对象
//面向过程：如果我要吃，我只用书写吃的功能；
//面向对象：如果我要吃，我先创建一个对象，让对象来执行吃的功能；



class Student{
	//设定说话的功能
	public void say() {
		System.out.println("我是学生");
	} 
}
class Teacher{
	public void say() {
		System.out.println("我是老师");
	} 
	public void run() {
		System.out.println("我跑得很快的啊！！！");
	}
}
//class 就是类的意思，同一时间，一个文件中只能存在一个public类
//只有公共类才可以书写public static void main
//所有程序只能在main函数里面运行

public class Hello {
	//这里就是main函数
	public static void main(String[] args) {
		
		System.out.println("主线程开始运行");
		
		Student stu=new Student();//这个过程叫做实例化   stu被称为Student类的一个实例
		Student stu2=new Student(); //stu 和stu2 是独立的存在，只不过都是有说的功能
		Teacher tea=new Teacher();
		
		
		stu2.say();
		tea.say();
		stu.say();
		//stu.run();  这里会运行失败，因为我们没给他设定run这个功能
		tea.run();
		System.out.println("---------------");
		Chenrui cr=new Chenrui();//一个 cr 实例被创建了！
		
		//设置cr的名字
		cr.name="joker";
		System.out.println(cr.name);
		//没有设置 int 就默认为0
		System.out.println(cr.age);
		//没有设置 String 默认为null
		System.out.println(cr.personality);
		//没有设置 boolean 默认为false
		System.out.println(cr.gender);
		
		
		cr.age=24;
		cr.personality="腹黑+毒舌（灵活的舌头~~~）";
		cr.gender=true;
		cr.height=1.85;
		cr.weight=60.5;
		
		System.out.println(cr.name+"的年龄是"+cr.age+",性格是："+cr.personality+",性别是"+cr.sex());
		
		
		System.out.println("要不看看他能说啥把？");
		cr.yark();
		
		
		
		
		
	}
	//因为kk()函数不在main函数里面，所以无法运行
	public void kk() {
		System.out.println("kakak");
	}
	
}

//定义class的位置的可以任意的
//命名规范，一般类名的开头一定要大写
//在Java当中有这么几种类型：
/*
 * 1.String 字符串类型， 比如 "lalalalala" 被双引号标记的内容都被称为String字符串类型；
 * 2.int 整数类型 比如:123123 
 * 3.char 字符类型 比如 'l' 被单引号标记的 一个！！！！字符被称为char 字符类型 
 * 举例：
 * 	"lalala"  相当于 'l'+'a'+'l'+'a'+'l'+'a'
 * 4.float 浮点类型，比如 1.34，56.23 这种带小数点的叫做浮点类型，最多保留8位有效数字
 * 5.double 双精度浮点类型，比如 1.56，1.788 这种带小数点的也可以是double类型，最多保留16位有效数字
 * 6.boolean 类型 ， 这个就两个值  true ,false 即真或者假
 * 剩下还有一些类型，此处先不予讨论
 * 
 */
		

class Chenrui{
	//定义chenrui的属性
	String name;  //名字属性
	int age;	//年龄属性
	double height; //身高
	double weight;  //体重
	boolean gender; //性别 要么男要么女
	String personality;//性格
	
	//设定功能
	public void yark() {
		System.out.println("老子日你哈马比！"+"你个龟孙！");
		System.out.println("老子天下第一！！");
	}
	public void code() {
		System.out.println("对，我确实会编程……");
	}
	
	
	
	//这个是一个判断性别的语句，后面会另外学习判断语句
	public String sex() {
		//  !(语句)  就是反转结果的意思  比如  !(true)  相当于 false  ; !0 相当于 1  
		if(!this.gender) {
			//因为return返回的  "女" 是字符串类型 所以它所在的方法函数   sex()函数也必须是字符串类型 
			return "女";
		}else {
			return "男";
		}
	}
}











