package com.pattern.behaviortype.chain;

/**
 * Description: 行为型-->责任链模式
 *
 * @author zuogangju
 * @date 2019/3/4 17:03
 * @version V1.0
 */
public class Client {
    public static void main(String[] args) {
        // 构造各个领导对象
        LeaderGroup leaderGroup = new LeaderGroup();
        LeaderDirector leaderDirector = new LeaderDirector();
        LeaderManager leaderManager = new LeaderManager();
        LeaderBoss leaderBoss = new LeaderBoss();
        // 设置上级领导处理者对象
        leaderGroup.nextHandler = leaderDirector;
        leaderDirector.nextHandler = leaderManager;
        leaderManager.nextHandler = leaderBoss;
        // 发起报账申请
        leaderGroup.handleRequest(8000);

    }
}
