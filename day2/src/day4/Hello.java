package day4;
//Java �����������
//���������˼�룺1.�������2.�������
//������̣������Ҫ�ԣ���ֻ����д�ԵĹ��ܣ�
//������������Ҫ�ԣ����ȴ���һ�������ö�����ִ�гԵĹ��ܣ�



class Student{
	//�趨˵���Ĺ���
	public void say() {
		System.out.println("����ѧ��");
	} 
}
class Teacher{
	public void say() {
		System.out.println("������ʦ");
	} 
	public void run() {
		System.out.println("���ܵúܿ�İ�������");
	}
}
//class ���������˼��ͬһʱ�䣬һ���ļ���ֻ�ܴ���һ��public��
//ֻ�й�����ſ�����дpublic static void main
//���г���ֻ����main������������

public class Hello {
	//�������main����
	public static void main(String[] args) {
		
		System.out.println("���߳̿�ʼ����");
		
		Student stu=new Student();//������̽���ʵ����   stu����ΪStudent���һ��ʵ��
		Student stu2=new Student(); //stu ��stu2 �Ƕ����Ĵ��ڣ�ֻ����������˵�Ĺ���
		Teacher tea=new Teacher();
		
		
		stu2.say();
		tea.say();
		stu.say();
		//stu.run();  ���������ʧ�ܣ���Ϊ����û�����趨run�������
		tea.run();
		System.out.println("---------------");
		Chenrui cr=new Chenrui();//һ�� cr ʵ���������ˣ�
		
		//����cr������
		cr.name="joker";
		System.out.println(cr.name);
		//û������ int ��Ĭ��Ϊ0
		System.out.println(cr.age);
		//û������ String Ĭ��Ϊnull
		System.out.println(cr.personality);
		//û������ boolean Ĭ��Ϊfalse
		System.out.println(cr.gender);
		
		
		cr.age=24;
		cr.personality="����+���ࣨ������ͷ~~~��";
		cr.gender=true;
		cr.height=1.85;
		cr.weight=60.5;
		
		System.out.println(cr.name+"��������"+cr.age+",�Ը��ǣ�"+cr.personality+",�Ա���"+cr.sex());
		
		
		System.out.println("Ҫ����������˵ɶ�ѣ�");
		cr.yark();
		
		
		
		
		
	}
	//��Ϊkk()��������main�������棬�����޷�����
	public void kk() {
		System.out.println("kakak");
	}
	
}

//����class��λ�õĿ��������
//�����淶��һ�������Ŀ�ͷһ��Ҫ��д
//��Java��������ô�������ͣ�
/*
 * 1.String �ַ������ͣ� ���� "lalalalala" ��˫���ű�ǵ����ݶ�����ΪString�ַ������ͣ�
 * 2.int �������� ����:123123 
 * 3.char �ַ����� ���� 'l' �������ű�ǵ� һ�����������ַ�����Ϊchar �ַ����� 
 * ������
 * 	"lalala"  �൱�� 'l'+'a'+'l'+'a'+'l'+'a'
 * 4.float �������ͣ����� 1.34��56.23 ���ִ�С����Ľ����������ͣ���ౣ��8λ��Ч����
 * 5.double ˫���ȸ������ͣ����� 1.56��1.788 ���ִ�С�����Ҳ������double���ͣ���ౣ��16λ��Ч����
 * 6.boolean ���� �� ���������ֵ  true ,false ������߼�
 * ʣ�»���һЩ���ͣ��˴��Ȳ�������
 * 
 */
		

class Chenrui{
	//����chenrui������
	String name;  //��������
	int age;	//��������
	double height; //���
	double weight;  //����
	boolean gender; //�Ա� Ҫô��ҪôŮ
	String personality;//�Ը�
	
	//�趨����
	public void yark() {
		System.out.println("�����������ȣ�"+"������");
		System.out.println("�������µ�һ����");
	}
	public void code() {
		System.out.println("�ԣ���ȷʵ���̡���");
	}
	
	
	
	//�����һ���ж��Ա����䣬���������ѧϰ�ж����
	public String sex() {
		//  !(���)  ���Ƿ�ת�������˼  ����  !(true)  �൱�� false  ; !0 �൱�� 1  
		if(!this.gender) {
			//��Ϊreturn���ص�  "Ů" ���ַ������� ���������ڵķ�������   sex()����Ҳ�������ַ������� 
			return "Ů";
		}else {
			return "��";
		}
	}
}











