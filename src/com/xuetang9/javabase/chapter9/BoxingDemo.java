package com.xuetang9.javabase.chapter9;
/**
 * ��װ��
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��8�� ����3:18:55
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class BoxingDemo {
	public static void main(String[] args) {
//		Book book1 = new Book("�Ͼž�����̸Java", "123-321", 98.8, 5);
//		Book book2 = new Book("�Ͼž�����̸Java", "123-321", 98.8, 5);
//		System.out.println(book1 == book2);
		
		Integer num1 = new Integer(100);
		Integer num2 = new Integer(200);
		//��������֮��ıȽϷ���
		System.out.println(num1.compareTo(num2));
		
		
//		double num1 = 3.14;	
//		Double dNum1 = new Double("3.14");
//		Double dNum1_1 = Double.valueOf(num1);	//����װ��ķ���
//		Double dNum1_2 = 3.14;	//�Զ�װ��
//		
//		num1 = dNum1;	//�Զ�����
//		num1 = dNum1_1.doubleValue();
//		
//		
//		System.out.println(num1 + "\t" + dNum1);

	}

}