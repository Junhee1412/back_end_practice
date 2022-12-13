/*

1. 참조타입에 대한 설명으로 틀린 것은 무엇인가? (4)
 
    1) 참조타입에는 배열, 열거, 클래스, 인터페이스가 있다.
    2) 참조타입변수의 메모리 생성위치는 스택이다.
    3) 참조타입에서 ==, !=연산자는 객체번지를 비교한다.
    4) 참조타입은 null값으로 초기화할 수 없다.
    
2. 자바에서 메모리 사용에 대한 설명으로 틀린 것은 무엇인가? (2)

   1) 로컬변수는 스택영역에 생성되며 실행블록이 끝나면 소멸된다.
   2) 메소드 코드나, 상수, 열거상수는 정적(메서드)영역에 생성된다.
   3) 참조되지 않는 객체는 프로그램에서 직접 소멸 코드를 작성하는 것이 좋다.
   4) 배열 및 객체는 힙영역에 생성된다.
   
3. String타입에 대한 설명으로 틀린 것은 무엇인가? (2)
   
   1) String은 클래스이므로 참조타입이다.
   2) String타입의 문자열 비교는 ==를 사용해야 한다.
   3) 동일한 문자열 리터럴을 저장하는 변수는 동일한 String객체를 참조한다.
   4) new String("문자열")은 문자열이 동일하더라도 다른 String객체를 생성한다.
   
4. 배열을 생성하는 방법으로 틀린 것은 무엇인가? (2)

   1) int[] array = {1,2,3};
   2) int[] array; array = {1,2,3};
   3) int[] array = new int[3];
   4) int[][] array = new int[3][2];

5. 배열의 기본초기값에 대한 설명으로 틀린 것은 무엇인가? (3)

   1) 정수타입 배열항목의 기본 초기값은 0이다.
   2) 실수타입 배열항목의 기본 초기값은 0.0F 또는 0.0이다.
   3) boolean타입 배열항목의 기본 초기값은 true이다.
   4) 참조타입 배열항목의 기본 초기값은 null이다.
 
6. Exercise07.java : 
   주어진 배열의 항목에서 최대값을 구하기.(for문을 이용)
   
   int[] array={1,5,3,8,2};
   
		   int max = 0;
		   
		   for(int i=0; i<array.length;i++){
			   if(array[i]>max) {
				   max=array[i];

			   }
		   }
		   System.out.println(max);
   
7. Exercise08.java : 
   주어진 배열의 전체 항목의 합과 평균값을 구하기.(중첩 for문을 이용) 
   
		int sum =0;   
		int can =0;
		double avg =0;

		int[][] array ={
					{95, 86},
					{83, 92, 96},
					{78, 83, 93, 87, 88}
				  };  

		   for(int i =0;i<array.length;i++) {
			   for(int j=0;j<array[i].length;j++)
				   sum += array[i][j];
			   can += array[i].length;
			   avg = (double)sum/can;
			   	
		   }
		   System.out.println(sum);
		   System.out.println(avg);
				  

8. Exercise09.java : 	
   키보드로부터 학생 수와 각 학생들의 점수를 입력받아서 최고 점수 및 평균 점수를 구하기
   (참고: Scanner의 nextlnt() 메소드이용)

	System.out.println("---------------------------------------------");
	System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
	System.out.println("---------------------------------------------");
	System.out.print("선택> ");	
	
	JOptionPan.showInputDialog() 이용해도 상관없음	
	
	
package exercise.answer;
import java.util.Scanner;
public class answer {

	public static void main(String[] args) {
		
		boolean run= true;
		int studentNum=0;
		int[] scores =null;
		int std =0;
		int score = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println("학생수>" + std);
				std = scanner.nextInt();
				scores = new int [std];
			}else if(selectNo == 2) {
				for(int i =0; i<scores.length;i++) {
					System.out.println("scores["+i+"] >");
					scores[i] = scanner.nextInt();
				};
			}else if(selectNo == 3) {
					for(int i =0;i<scores.length;i++) {
						System.out.println("scores ["+i+"]="+ scores[i]);
					};
			}else if(selectNo == 4) {
			    int sum=0;
			    int avg=0;
			    int max=0;
				for(int i =0; i<scores.length; i++){
					if(scores[i]>max) {
						max=scores[i];
					}
			    	sum += scores[i];
			    	avg = sum/scores.length;//작성 위치
			    }
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + avg);
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}

*/