package com.pattern.structuretype.flyweight;
/**
 * Description: 车票接口
 *
 * @author zuogangju
 * @date 2019/3/4 15:55
 * @version V1.0
 */
public interface Ticket {
    /**
     * 显示车票信息
     * @param bunk 铺位
     */
    void showTicketInfo(String bunk);
}
