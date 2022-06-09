package test;

import java.util.Scanner;

public class Member {
public static void main(String[] args) {
	
	String num1 = null ,num2;
	int num = 0;
	Scanner sc =new Scanner(System.in);
	while(true) {
		System.out.println("1. 회원 저장");
		System.out.println("2. 회원 수 ");
		

        int input = sc.nextInt();
        switch(input) {
        case 1:
            System.out.println("등록할 회원을 입력하세요");
            num1 = sc.next();
            
           
            System.out.println("등록된 회원은 "+num1+"입니다.");
        case 2:
            System.out.println("등록된 회원의 수 : " +(++num));
	}
        
}
}
}