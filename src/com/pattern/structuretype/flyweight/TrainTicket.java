package com.pattern.structuretype.flyweight;

import java.util.Random;

/**
 * Description: 火车票
 *
 * @author zuogangju
 * @date 2019/3/4 15:57
 * @version V1.0
 */
public class TrainTicket implements Ticket{
	/**
	 *  始发地
	 */
	public String from;
	/**
	 *  目的地
	 */
	public String to;
	/**
	 *  铺位
	 */
	public String bunk;
	/**
	 *  价格
	 */
	public int price;
	
	public TrainTicket(String from, String to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public void showTicketInfo(String bunk) {
		price = new Random().nextInt(300);
		System.out.println("购买 从 " + from + " 到 " + to + "的" + bunk + "火车票" + ", 价格：" + price);
	}

}
