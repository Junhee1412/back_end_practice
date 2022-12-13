package exercise.exam;
/* 1. 조건문과 반복문의 종류를 괄호()속에 넣으세요
 
    1) 조건문 : (  if   ), (  switch   )
    2) 반복문 : (  for   ), (  while   ), (  do while  )
 
 2. 조건문과 반복문을 설명한 것중 틀린 것은 무엇인가? (4)
 
    1) if문은 조건식의 결과에 따라 실행 흐름을 달리 할 수 있다.
    2) switch문에서 사용할 수 있는 변수의 타입은 int, double이 될 수 있다.
    3) for문은 카운터 변수로 지정한 횟수 만큼 반복시킬때 사용할 수 있다.
    4) break문은 switch문, while문을 종료할 때 사용할 수 있다.
 
 3. Exercise03.java : 
    for문을 이용해서 1~100까지의 정수중 3의 배수총합을 구하는 코드
    
    public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i =0; i<=100; i++) {
			if(i%3==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

 4. Exercise04.java : 
    while문과 Math.random()메서드를 이용해서 두개의 주사위를 던졌을 때 나오는 눈을 
    (눈1, 눈2)형태로 출력하고 눈의 합이 5가아니면 계속 주사위를 던지고 눈의 합이 5이면
    실행을 멈추는 코드를 작성 (눈의 합이 5가되는 조합은 (1,4) (4,1) (2,3) (3,2)

	public static void main(String[] args) {
		
		int num1 =0;
		int num2 =0;
		
		do {
			num1 = (int)(Math.random()*6)+1;
			num2 = (int)(Math.random()*6)+1;
			System.out.println("(" + num1 + "," + num2 + ")");
		}while(num1+num2!=5);
		System.out.println();
		System.out.println("프로그램종료!!");
	}

 5. Exercise05.java :
    중첩for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x,y)형태로 출력
    단 x와 y는 10이하의 자연수이다.

		for(int x=1;x<=10;x++) {
			for(int y=1; y<=10; y++) {
				if(4*x+5*y==60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}


 6. Exercise06.java : 
    for문을 이용해서 삼각형을 출력하는 코드를 작성
    1)
    *
    **
    ***
    ****
    *****
	
	for(int i=0;i<=4;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	2)
    *****
    ****
    ***
    **
    *
    *
    for(int i=0;i<=4;i++) {
		for(int j=4;i<=j;j--) {
			System.out.print("*");
				}
				System.out.println("");
			}
		}
		
    3)
        *
       **
      ***
     ****
    *****
    			for(int i=0;i<5;i++) {
				for(int j=4;i<j;j--) {
					System.out.print(" ");
					}
				for(int k=0;k<i+1;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
    4) 
    *****
     ****
      ***
       **
        *
    for(int i=0;i<5;i++) {
		for(int j=0;j<i;j++) {
			System.out.print(" ");
			}
		for(int k=5;k>i;k--) {
			System.out.print("*");
		}
			System.out.println();
		}
    5)	
       *
      ***
     *****
    *******
    
    for(int i=0;i<4;i++) {
		for(int j=3;i<j;j--) {
			System.out.print(" ");
			}
		for(int k=0;k<i+1;k++) {
			System.out.print("*");
		}
		for(int m=0;m<i;m++) {
			System.out.print("*");
		}
		System.out.println();
		}
    
    6)
    *******
     *****
      ***
       *
       	for(int i=4;i>=0;i--) {
		for(int j=4;i<j;j--) {
			System.out.print(" ");
			}
		for(int k=0;k<i-1;k++) {
			System.out.print("*");
		}
		for(int m=0;m<i;m++) {
			System.out.print("*");
		}
		System.out.println();
		}
    7)
       *
      ***
     *****
    *******      
     *****
      ***
       *  

for(int i=0;i<4;i++) {
			for(int j=3;i<j;j--) {
				System.out.print(" ");
				}
			for(int k=0;k<i+1;k++) {
				System.out.print("*");
			}
			for(int m=0;m<i;m++) {
				System.out.print("*");
			}
			System.out.println();
			}
		
	for(int i=3;i>=0;i--) {
		for(int j=4;i<j;j--) {
			System.out.print(" ");
			}
		for(int k=0;k<i-1;k++) {
			System.out.print("*");
		}
		for(int m=0;m<i;m++) {
			System.out.print("*");
		}
		System.out.println();
		}


 7. Exercise07.java : 
 while문과 Scanner를 이용해서 키보드로 부터 입력된 데이터로 예금, 출금, 조회, 종료기능을
 제공하는 코드를 작성(예금잔액을 입출금내역을 출력)
 WhileKeyControlMain.java를 참조해서 자유롭게 작성
				System.out.println("-------------------------------------");
				System.out.println("1. 예금 | 2. 출금 | 3. 조회 | 4. 종료");
				System.out.println("-------------------------------------");
				
				JOptionPan.showInputDialog() 이용해도 상관없음 
				
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
				
				
				*/

import java.util.Scanner;
