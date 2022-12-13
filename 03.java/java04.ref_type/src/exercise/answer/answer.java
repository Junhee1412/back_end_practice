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