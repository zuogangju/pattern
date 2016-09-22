package com.pattern.mythead;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
/**
 * 
* @ClassName: ProducerConsumerService
* @Description: 使用阻塞队列实现生产者-消费者问题。
* @author zuozuo
* @date 2016年9月21日 下午1:50:11
 */
public class ProducerConsumerService {
	public static void main(String[] args) {
		// Creating BlockingQueue of size 10
		BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(10);
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		// starting producer to produce messages in queue
		new Thread(producer).start();
		// starting consumer to consume messages from queue
		new Thread(consumer).start();
		System.out.println("Producer and Consumer has been started");
	}
}
