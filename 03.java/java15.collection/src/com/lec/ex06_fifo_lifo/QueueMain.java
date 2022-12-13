package com.lec.ex06_fifo_lifo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		
		Queue<Message> message = new LinkedList<Message>();
		message.offer(new Message("Twitter", "홍길순"));
		message.offer(new Message("Mail", "홍길동"));
		message.offer(new Message("FaceBook", "홍길자"));
		message.offer(new Message("FaceBook", "홍길자"));
		System.out.println("총 객체수  = " + message.size());
		System.out.println();
		
		while(!message.isEmpty()) {
			Message msgx = message.poll();
			System.out.println(msgx.to + " = " + msgx.msg);
		}
	}

}


class Message {
	String msg;
	String to;

	public Message(String msg, String to) {
		super();
		this.msg = msg;
		this.to = to;
	}
}