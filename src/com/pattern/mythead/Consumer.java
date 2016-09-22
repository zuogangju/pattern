package com.pattern.mythead;

import java.util.concurrent.BlockingQueue;
/**
 * 
* @ClassName: Consumer
* @Description: 消费者
* @author zuozuo
* @date 2016年9月21日 下午1:45:29
 */
public class Consumer implements Runnable {

	private BlockingQueue<Message> queue;

	public Consumer(BlockingQueue<Message> q) {
		this.queue = q;
	}

	@Override
	public void run() {
		try {
			Message msg;
			// consuming messages until exit message is received
			while ((msg = queue.take()).getMsg() != "exit") {
				Thread.sleep(10);
				System.out.println("Consumed " + msg.getMsg());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
