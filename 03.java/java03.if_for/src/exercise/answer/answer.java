package exercise.answer;

import java.util.Scanner;

public class answer {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		int data =0;
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");
			data = scanner.nextInt();
			if(data==1) {
				balance += scanner.nextInt();
				System.out.println("예금액>"+ balance);
			} else if(data ==2){
				balance -= scanner.nextInt();
				System.out.println("출금액>"+ balance);
			} else if(data ==3) {
				System.out.println("잔고>"+balance);
			} else {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}