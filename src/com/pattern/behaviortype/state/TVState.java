package com.pattern.behaviortype.state;

/**
 * Description: 电视状态接口，定义了电视的操作函数
 *
 * @author zuogangju
 * @version V1.0
 * @date 2019/3/6 15:10
 */
public interface TVState {
    /**
     * 下一个频道
     */
    void nextChannel();

    /**
     * 上一个频道
     */
    void prevChannel();

    /**
     * 调高音量
     */
    void turnUp();

    /**
     * 调低音量
     */
    void turnDown();

}
