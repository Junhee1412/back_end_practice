/*
1. ABC

2. CD

3. CDG

4.
public static ArrayList<T extends Product> merge(

	ArrayList<T> list, ArrayList<T> list2) {
	
	ArrayList<? extends Product> newList = new ArrayList<>(list);
	
	return newList.addAll(list2);
	
	}
	
5. 

class Exercise12_5 {
	public static void main(String args[]) {
		Deck d = new Deck(); // (Deck) . 카드 한 벌 을 만든다
		Card c = d.pick(0); // . 섞기 전에 제일 위의 카드를 뽑는다
		System.out.println(c); // System.out.println(c.toString()); . 과 같다
		
		d.shuffle(); // . 카드를 섞는다
		c = d.pick(0); // . 섞은 후에 제일 위의 카드를 뽑는다
		System.out.println(c);
		}
	}
class Deck {
	final int CARD_NUM = Card.Kind.values().length * Card.Number.values().length; // 카드의 개수
	Card cardArr[] = new Card[CARD_NUM]; // Card객체 배열을 포함
	
	Deck () {
	int i=0;
		for(Card.Kind kind : Card.Kind.values()) {
		for(Card.Number num : Card.Number.values()) {
		cardArr[i++] = new Card(kind, num);
			}
		}
	}
}

Card pick(int index) { // (index) 지정된 위치 에 있는 카드 하나를 꺼내서 반환
	return cardArr[index];
}

Card pick() { // Deck . 에서 카드 하나를 선택한다
	int index = (int)(Math.random() * CARD_NUM);
	return pick(index);
}

void shuffle() { // . 카드의 순서를 섞는다
	for(int i=0; i < cardArr.length; i++) {
		int r = (int)(Math.random() * CARD_NUM);
		Card temp = cardArr[i];
		cardArr[i] = cardArr[r];
		cardArr[r] = temp;
		}
	}
} // Deck클래스의 끝

// Card클래스

class Card {
	enum Kind { CLOVER, HEART, DIAMOND, SPADE }
	
	int i=0;
	for(Card.Kind kind : Card.Kind.values()) {
	for(Card.Number num : Card.Number.values()) {
	cardArr[i++] = new Card(kind, num);
		}
	}

enum Number {
		ACE, TWO, THREE, FOUR, FIVE,
		SIX, SEVEN, EIGHT, NINE, TEN,
		JACK, QUEEN, KING
	}
Kind kind;
Number num;

Card() {
	this(Kind.SPADE, Number.ACE);
}
Card(Kind kind, Number num) {
	this.kind = kind;
	this.num = num;
}
public String toString() {
		return "[" + kind.name() + "," + num.name() + "]";
	} // toString()의 끝
} // Card클래스의 끝


6. C

7. BD


13-1.

class Exercise13_1{
	public static void main(String args[]) {
		Thread th1 = new Thread(new Thread1());
		th1.start();
		}
	}		

class Thread1 implements Runnable {
	public void run() {
	for(int i=0; i < 300; i++) {
	System.out.print('-');
		}
	}
}

13-2. B

13-3. BF

13-4. D

13-5. 012345까지 써지고 꽝~!!!이라는 예외가 발생 후 6789써짐.

13-6.
*/