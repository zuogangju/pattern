package com.pattern.structuretype.flyweight;
/**
 * Description: 结构型-->享元模式
 *
 * @author zuogangju
 * @date 2019/3/4 15:54
 * @version V1.0
 */
final class Client {
	public static void main(String[] args) {
		Ticket ticket01 = TicketFactory.getTicket("北京", "青岛");
		ticket01.showTicketInfo("上铺");
		
		Ticket ticket02 = TicketFactory.getTicket("北京", "青岛");
		ticket02.showTicketInfo("下铺");
		
		Ticket ticket03 = TicketFactory.getTicket("北京", "西安");
		ticket03.showTicketInfo("坐票");
	}
}
