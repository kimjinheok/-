package test;

import java.util.Scanner;

public class Member {
public static void main(String[] args) {
	
	String num1 = null ,num2;
	int num = 0;
	Scanner sc =new Scanner(System.in);
	while(true) {
		System.out.println("1. ȸ�� ����");
		System.out.println("2. ȸ�� �� ");
		

        int input = sc.nextInt();
        switch(input) {
        case 1:
            System.out.println("����� ȸ���� �Է��ϼ���");
            num1 = sc.next();
            
           
            System.out.println("��ϵ� ȸ���� "+num1+"�Դϴ�.");
        case 2:
            System.out.println("��ϵ� ȸ���� �� : " +(++num));
	}
        
}
}
}