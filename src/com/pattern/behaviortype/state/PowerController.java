package com.pattern.behaviortype.state;

/**
 * Description: 电源操作接口
 *
 * @author zuogangju
 * @version V1.0
 * @date 2019/3/6 15:09
 */
public interface PowerController {
    /**
     * 开机
     */
    void powerOn();

    /**
     * 关机
     */
    void powerOff();
}
