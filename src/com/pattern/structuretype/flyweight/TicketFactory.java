package com.pattern.structuretype.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 * Description: 车票工厂
 *
 * @author zuogangju
 * @date 2019/3/4 15:56
 * @version V1.0
 */
public class TicketFactory {
    private static Map<String, Ticket> sTicketMap = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "-" + to;
        if (sTicketMap.containsKey(key)) {
            System.out.println("使用缓存 ==> " + key);
            return sTicketMap.get(key);
        } else {
            System.out.println("创建对象 ==> " + key);
            Ticket ticket = new TrainTicket(from, to);
            sTicketMap.put(key, ticket);
            return ticket;
        }

    }
}
