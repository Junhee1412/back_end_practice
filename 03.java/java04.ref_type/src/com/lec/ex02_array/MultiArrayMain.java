package com.lec.ex02_array;

public class MultiArrayMain {

	public static void main(String[] args) {
		//Java에서는 다차원배열을 선언할 수 있다.
		//다차원배열은 정방형과 비정방형도 선언할 수 있다.
		
		//1. 2행 3열인 배열선언하기
		int [][] mathScores = new int [2][3];
		//배열의 크기 확인
		System.out.println(mathScores.length);
		System.out.println(mathScores[0].length);
		System.out.println(mathScores[1].length);
		System.out.println();
		
		//2. 정방형배열
		for(int i = 0;i<mathScores.length;i++) {
			for(int j=0;j<mathScores[i].length;j++) {
				System.out.println("mathScores [" + i + "][" + j + "]");
			}
		}
		System.out.println();
		
		//3. 비정방형배열 3행 ?열
		int [][] engScores = new int[3][];
		System.out.println(engScores.length);//3
		//System.out.println(engScores[0].length);//에러 비정방형 값이 없어서 에러가 발생함.
		
		engScores[0] = new int[2];
		engScores[1] = new int[5];
		engScores[2] = new int[1];
		System.out.println("engScores[0] = " + engScores[0].length);
		System.out.println("engScores[1] = " + engScores[1].length);
		System.out.println("engScores[2] = " + engScores[2].length);
		System.out.println();
		
		for(int i = 0;i<engScores.length;i++) {
			for(int j=0;j<engScores[i].length;j++) {
				System.out.println("engScores [" + i + "][" + j + "]");
			}
		}
		System.out.println();
		
		//4. 2차원배열을 선언과 동시에 초기화하기
		
		int[][] korScores= {{99, 88},{95, 92, 90, 89, 93},{100}};
		
		for(int i = 0;i<korScores.length;i++) {
			for(int j=0;j<korScores[i].length;j++) {
				System.out.println("korScores [" + i + "][" + j + "]" + korScores[i][j]);
			}
		}
		System.out.println();
		
		//5. 참조타입
		String[][] singers = {{"소향","거미"},{"나얼","박효신","김범수"},{"송가인","장윤정"}};
		
		for(int i = 0;i<singers.length;i++) {
			for(int j=0;j<singers[i].length;j++) {
				System.out.println("singers [" + i + "][" + j + "]" + singers[i][j]);
			}
		}
		System.out.println();
		
		//6. 얕은 복사
		String[][] names = singers;
		singers[0][0] = "블랙핑크";
		singers[1][0] = "BTS";
		
		for(int i = 0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				System.out.println("names [" + i + "][" + j + "]" + names[i][j]);
			}
		}
		System.out.println();
		
		for(int i = 0;i<singers.length;i++) {
			for(int j=0;j<singers[i].length;j++) {
				System.out.println("singers [" + i + "][" + j + "]" + singers[i][j]);
			}
		}
		System.out.println();
		
	}
}