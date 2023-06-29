package project;

import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {

		System.out.println("========게시판========");
		
		boardService b = new boardImpl();

		int num;
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1. 글 목록보기");
			System.out.println("2. 글 작성하기");
			System.out.println("3. 프로그램 종료");
			System.out.println(">>>");
			num = scan.nextInt();
			
			switch(num) {
			case 1: 
				b.display();
				break;
			case 2:
				b.posting();
				break;
			case 3:
				
				break;
			}


		}

		



	}

}

